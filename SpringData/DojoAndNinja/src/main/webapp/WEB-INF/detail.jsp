<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dojo Page</title>
</head>
<body>
	<h1>${dojo.name } Location Ninjas</h1>
	
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="ninja" items="${ninjas }">
			<tr>
				<th>${ninja.firstName }</th>
				<th>${ninja.lastName }</th>
				<th>${ninja.age }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>