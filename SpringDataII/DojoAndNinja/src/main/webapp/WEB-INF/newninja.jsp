<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>new Ninja</title>
</head>
<body>
	<form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
		<form:hidden path="id"/>
		<h1>New Ninja</h1>
		
		<form:label path="dojo">Dojo:
			<form:errors path="dojo"/>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos }">
					<form:option value="${dojo.id }" label="${dojo.name }"></form:option>
				</c:forEach>
			</form:select>
		</form:label>
		
		<form:label path="firstName">First Name:
	    <form:errors path="firstName"/>
	    <form:input path="firstName"/></form:label>
	    
	    <form:label path="lastName">Last Name:
	    <form:errors path="lastName"/>
	    <form:input path="lastName"/></form:label>
		
		<form:label path="age">age:
	    <form:errors path="age"/>
	    <form:input path="age" type="number"/></form:label>
		
		<input type="submit" value="Create"/>
		
	</form:form>
</body>
</html>