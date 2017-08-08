<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
	<h1>Prototype Roaster</h1>
	<a href="/TeamRoaster/NewTeam">New Team</a>
	<br><br>
	<table>
		<tr>
			<th>Team</th>
			<th>Players</th>
			<th>Action</th>
		</tr>
	
	<c:forEach var="team" items="${teams}" varStatus="status">
	<tr>
		<td><c:out value="${team.getName() }"/></td>
		<td><c:out value="${team.getPlayerCount() }"/></td>
		<td>
			<a href="/TeamRoaster/Team?id=${status.count - 1}">Details</a>
			<a href="">Delete</a>
		</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>