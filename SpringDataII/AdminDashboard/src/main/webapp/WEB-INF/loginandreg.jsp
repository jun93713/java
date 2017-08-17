<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login and Registration</title>
</head>
<body>
	<div class="login">
		<c:if test="${logoutMessage != null}">
	        <c:out value="${logoutMessage}"></c:out>
	    </c:if>

	    <c:if test="${errorMessage != null}">
	        <c:out value="${errorMessage}"></c:out>
	    </c:if>
		<h1>Login</h1>
		
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
	
	<div class="register">
		<h1>Register</h1>
    
	    <p><form:errors path="user.*"/></p>
	    
	    <form:form method="POST" action="/registration" modelAttribute="user">
	        <p>
	            <form:label path="username">Email:</form:label>
	            <form:input path="username"/>
	        </p>
	        <p>
	            <form:label path="firstName">First Name:</form:label>
	            <form:input path="firstName"/>
	        </p>
	        <p>
	            <form:label path="lastName">Last Name:</form:label>
	            <form:input path="lastName"/>
	        </p>
	        <p>
	            <form:label path="password">Password:</form:label>
	            <form:password path="password"/>
	        </p>
	        <p>
	            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
	            <form:password path="passwordConfirmation"/>
	        </p>
	        <input type="submit" value="Register"/>
	    </form:form>
	</div>
</body>
</html>