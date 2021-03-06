<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/songs/topten">Top Songs</a>
	
	<form action="/songs/search" method="post">
		<input type="text" name="search">
		<input type="submit" value="Search Artists">
	</form>
	
	
	<table>
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>actions</th>
		</tr>
		<c:forEach var="song" items="${songs }">
			<tr>
				<td><a href="/songs/${song.id }">${song.title }</a></td>
				<td>${song.rating }</td>
				<td><a href="/songs/delete/${song.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>