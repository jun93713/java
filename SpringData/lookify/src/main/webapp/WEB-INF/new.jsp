<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Song</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<form:form method="POST" action="/songs/new" modelAttribute="song">
		<form:hidden path="id"/>
	
	    <form:label path="title">Title
	    <form:errors path="title"/>
	    <form:input path="title"/></form:label>
	    
	    <form:label path="artist">Artist
	    <form:errors path="artist"/>
	    <form:input path="artist"/></form:label>
	    
	    <form:label path="rating">Rating
	    <form:errors path="rating"/>
	    <form:input path="rating" type="number" min="1" max="10" value="1"/></form:label>
	    
	    <input type="submit" value="Add Song"/>
	</form:form>
</body>
</html>