<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Details</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<h1>Title: ${song.title }</h1>
	<h1>Artist: ${song.artist }</h1>
	<h1>Rating(1-10): ${song.rating }</h1>
	<a href="/songs/delete/${song.id }">Delete</a>
</body>
</html>