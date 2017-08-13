<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Top Ten Songs</title>
<style>
	div{
		width: 500px;
		border: 1px solid black;
		padding-left: 20px;
	}
</style>
</head>
<body>
<a href="/dashboard">Dashborad</a>
	<h1>Top Ten Songs:</h1>
	
	
	<div>
		<c:forEach var="song" items="${songs }">
			<h2>${song.rating } - <a href="/songs/${song.id }">${song.title }</a> - ${song.artist }</h2>
		</c:forEach>
	</div>
</body>
</html>