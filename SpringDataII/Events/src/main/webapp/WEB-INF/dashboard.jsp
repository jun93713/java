<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Events</title>
</head>
<style>
table {
    border-collapse: collapse;
}

table, th, td {
    border: 1px solid black;
    padding: 3px 10px;
}
</style>
<body>
    <h1>Welcome <c:out value="${currentUser.firstName}"></c:out></h1>
    
    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
    
    <p>Here are some of the events in your state:</p>
    <table style="text-align:center">
    		<tr>
    			<th>Name</th>
    			<th>Date</th>
    			<th>Location</th>
    			<th>Host</th>
    			<th>Action/Status</th>
    		</tr>
    		<c:forEach var="event" items="${events }">
    		<c:if test="${currentUser.state.equals(event.state) }">
    		<tr>
    			<td><a href="/events/${event.id }">${event.name }</a></td>
    			<td><fmt:formatDate value="${event.date }" dateStyle = "long" type = "date" /></td>
    			<td>${event.location }</td>
    			<td>${event.host.firstName }</td>
    			<c:if test="${event.host.id == currentUser.id }">
    			<td><a href="/events/${event.id}/edit">Edit</a> &nbsp&nbsp&nbsp  <a href="/delete/${event.id }">Delete</a></td>
    			</c:if>
    			<c:if test="${event.host.id != currentUser.id }">
    				<c:if test="${event.users.contains(currentUser) }">
				<td>Joining <a href="/cancel/${event.id}">Cancel</a></td>
				</c:if>
				<c:if test="${!event.users.contains(currentUser) }">
				<td><a href="/join/${event.id}">Join</a></td>
				</c:if>
    			</c:if>
    			
    		</tr>
    		</c:if>
    		</c:forEach>
    </table>
    
    <p>Here are some of the events in other states:</p>
    <table style="text-align:center">
    		<tr>
    			<th>Name</th>
    			<th>Date</th>
    			<th>Location</th>
    			<th>State</th>
    			<th>Host</th>
    			<th>Action</th>
    		</tr>
    		<c:forEach var="event" items="${events }">
    		<c:if test="${!currentUser.state.equals(event.state) }">
    		<tr>
    			<td><a href="/events/${event.id }">${event.name }</a></td>
    			<td><fmt:formatDate value="${event.date }" dateStyle = "long" type = "date" /></td>
    			<td>${event.location }</td>
    			<td>${event.state }</td>
    			<td>${event.host.firstName }</td>
    			
			<c:if test="${event.users.contains(currentUser) }">
			<td>Joining <a href="/cancel/${event.id}">Cancel</a></td>
			</c:if>
			<c:if test="${!event.users.contains(currentUser) }">
			<td><a href="/join/${event.id}">Join</a></td>
			</c:if>
    			
    		</tr>
    		</c:if>
    		</c:forEach>
    </table>
    
    <h1>Create an Event</h1>
    <form:form method="POST" action="/event" modelAttribute="event">
    		<form:hidden path="host" value="${currentUser.id}"/>
    		<p>
            <form:label path="name">Name:</form:label>
            <form:input path="name"/>
        </p>
        <p>
            <form:label path="date">Date:</form:label>
            <form:input path="date" type="date"/>
        </p>
        <tr>
            <td><form:label path="location">Location:</form:label></td>
            <td><form:input path="location" class="shortinput"/>
            <form:select path="state" items="${states}" /></td>
        </tr>
        <input type="submit" value="New Event"/>
    </form:form>
</body>
</html>