<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit</title>

</head>
<body>
<form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form><a href="/events">Back to Events</a>
	<h1>${event.name }</h1>
	<h3>Edit Event</h3>
	<form:form method="POST" action="/event/${event.id}" modelAttribute="event">
    		<form:hidden path="host" value="${currentUser.id}"/>
    		<p>
            <form:label path="name">Name:</form:label>
            <form:input path="name" value="${event.name }"/>
        </p>
        <p>
            <form:label path="date">Date:</form:label>
            <form:input path="date" type="date"/>
        </p>
        <p>
            <form:label path="location">Location:</form:label>
            <form:input path="location" value="${event.location }"/>
            <form:select path="state" items="${states}"/>
        </p>
        <input type="submit" value="Edit"/>
    </form:form>
	
</body>
</html>