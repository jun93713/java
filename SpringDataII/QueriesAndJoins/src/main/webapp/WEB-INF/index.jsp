<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Query</title>
</head>
<body>
	<table>
		<tr>
			<th>country name</th>
			<th>city name</th>
			<th>district</th>
			<th>population</th>
		</tr>
		<c:forEach var="city" items="${cities }">
			<tr>
				<td>${city.country.name }</td>
				<td>${city.name }</td>
				<td>${city.district }</td>
				<td>${city.population}</td>
				
			</tr>
    		</c:forEach>
	
	</table>
    	
</body>
</html>