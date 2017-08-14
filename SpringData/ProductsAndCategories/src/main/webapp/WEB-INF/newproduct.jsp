<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<form:form method="POST" action="/new/product" modelAttribute="product">
		<form:hidden path="id"/>
		<h1>New Product</h1>
		
		<form:label path="name">Name:
		    <form:errors path="name"/>
		    <form:input path="name"/>
		</form:label>
		
		<form:label path="description">Description:
		    <form:errors path="description"/>
		    <form:input path="description"/>
		</form:label>
		
		<form:label path="price">Price:
		    <form:errors path="price"/>
		    <form:input path="price"/>
		</form:label>
		
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>