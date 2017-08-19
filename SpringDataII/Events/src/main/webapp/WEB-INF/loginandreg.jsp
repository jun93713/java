<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login and Registration</title>
<style>
.register{
	border: 1px solid black;
	display: inline-block;
	padding: 10px;
}
.login{
	border: 1px solid black;
	display: inline-block;
	vertical-align: top;
	padding: 10px;
}
.shortinput{
	width: 73px;
}
</style>
</head>
<body>
	
	
	<div class="register">
		<h1>Register</h1>
    
	    <p><form:errors path="user.*"/></p>
	    
	    <form:form method="POST" action="/registration" modelAttribute="user">
	    	<table>
	        <tr>
	            <td><form:label path="firstName">First Name:</form:label></td>
	            <td><form:input path="firstName"/></td>
	        </tr>
	        <tr>
	            <td><form:label path="lastName">Last Name:</form:label></td>
	            <td><form:input path="lastName"/></td>
	        </tr>
	        <tr>
	            <td><form:label path="username">Email:</form:label></td>
	            <td><form:input path="username"/></td>
	        </tr>
	        <tr>
	            <td><form:label path="location">Location:</form:label></td>
	            <td><form:input path="location" class="shortinput"/>
	            <form:select path="state" items="${states}" /></td>
	        </tr>
	        <tr>
	            <td><form:label path="password">Password:</form:label></td>
	            <td><form:password path="password"/></td>
	        </tr>
	        <tr>
	            <td><form:label path="confirmPassword">Password Confirmation:</form:label></td>
	            <td><form:password path="confirmPassword"/></td>
	        </tr>
	    </table>
	        <input type="submit" value="Register"/>
	    
	    </form:form>
	</div>
	
	<div class="login">
		<h1>Login</h1>
		<p>${errorMessage }</p>
		<p>${logoutMessage }</p>
		<form action="/login" method="POST">
			<p>
	            <label for="username">Email</label>
	            <input type="text" id="username" name="username"/>
	        </p>
	        <p>
	            <label for="password">Password</label>
	            <input type="password" id="password" name="password"/>
	        </p>
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        <input type="submit" value="Login"/>
		</form>
	</div>
</body>
</html>