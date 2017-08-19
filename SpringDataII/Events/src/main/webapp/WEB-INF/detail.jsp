<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${event.name }</title>
<style>
.info{
	width: 400px;
	display: inline-block;
	vertical-align: top;
}
.message{
	width: 400px;
	display: inline-block;
}
.box{
	height: 300px;
	border: 1px solid black;
	overflow: auto;
}
</style>
</head>
<body>
<form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form> <a href="/events">Back to Events</a>
<div class="info">
	<h1>${event.name }</h1>
	<p>Host: ${event.host.firstName } ${event.host.lastName }</p>
	<p>Date: <fmt:formatDate value="${event.date }" dateStyle = "long" type = "date" /></p>
	<p>Location: ${event.location }, ${event.state }</p>
	<p>People who are attending the event: ${event.users.size()}</p>
	<table style="text-align:center">
		<tr>
			<th>Name</th>
			<th>Location</th>
		</tr>
		<c:forEach var="user" items="${event.users }">
		<tr>
			<td>${user.firstName } ${user.lastName }</td>
			<td>${user.location }</td>
		</tr>
		</c:forEach>
	</table>
</div>	
<div class="message">
	<h1>Message Wall</h1>
	<div class="box">
	<c:forEach var="msg" items="${event.messages }">
		<p>${msg.name } says: ${msg.msg }</p>
	</c:forEach>
	</div>
	<form:form method="POST" action="/message" modelAttribute="message">
		<p>Add Comment:</p>
		<form:textarea path="msg" rows="2" cols="20"/>
		<form:hidden path="name" value="${event.host.firstName } ${event.host.lastName }"/>
		<form:hidden path="event" value="${event.id }"/>
		<input type="submit" value="Submit">
	</form:form>
</div>
</body>
</html>