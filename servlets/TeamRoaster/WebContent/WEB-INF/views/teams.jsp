<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Team</title>
<style>
table {
    border-collapse: collapse;
}

table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
	<h1>${team.getName()}</h1>
	<a href="/TeamRoaster/Ninja?id=${id}">New Ninja</a>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="player" items="${players }">
		<tr>
			<th>${player.getFirstName() }</th>
			<th>${player.getLastName() }</th>
			<th>${player.getAge() }</th>
			<th><a href="">Delete</a></th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>