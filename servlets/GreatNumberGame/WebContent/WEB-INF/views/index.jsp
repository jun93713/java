<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Great Number Game</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h1>Welcome to the Great Number Game!</h1>
	<h2>I'm thinking of a number between 1 and 100</h2>
	<h2>Take a guess!</h2>
	<form action="/GreatNumberGame/" method="post">
		<input type="number" name="guess">
		<input type="submit" value="submit">
	</form>
	<% String result = (String) request.getSession().getAttribute("result"); %>
	<% if ( result != "equal") {%>
		<div class="redbox"><h1><%= result %></h1></div>
	<% } else {%>
		<div class="greenbox">
			<h1><%= request.getSession().getAttribute("number") %> was the number!</h1>
			<form action="/GreatNumberGame">
				<input type="submit" value="Play Again">
			</form>
		</div>
	<% } %>
</body>
</html>