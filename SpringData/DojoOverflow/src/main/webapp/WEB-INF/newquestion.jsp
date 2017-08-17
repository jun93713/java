<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Question</title>
</head>
<body>
	<form:form method="POST" action="/new" modelAttribute="helper">

		<h1>What is your question?</h1>
		
		<form:label path="question">Question:
		    <form:errors path="question"/>
		    <form:textarea path="question" cols="50" rows="5"/>
		</form:label>
		
		<form:label path="tags">Tags:
		    <form:errors path="tags"/>
		    <form:input path="tags"/>
		</form:label>
		
		<form:button type="submit">Value</form:button>
	</form:form>
</body>
</html>