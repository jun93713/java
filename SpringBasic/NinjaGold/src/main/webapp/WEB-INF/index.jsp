<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ninja Gold</title>
<style>
*{
	margin: 0;
}
.gold h1{
	display: inline-block;
	vertical-align: top;
}
.gold form{
	display: inline-block;
	vertical-align: bottom;
	margin-left: 400px;
}
.building{
	display: inline-block;
	vertical-align: top;
	width: 200px;
	height: 150px;
	border: 1px solid black;
	text-align: center;
	margin: 10px;
}
.act{
	width: 900px;
	height: 200px;
	border: 1px solid black;
	overflow: auto;
}
.win{
	color: green;
}
.lost{
	color: red;
}

</style>
</head>
<body>
	<div class="gold">
		<h1>Your Gold: <c:out value="${gold}"/></h1>
		<form action="/gold" method="post">
			<input type="hidden" name="gold" value="reset">
			<input type="submit" value="Reset">
		</form>
	</div>
	
	<form action="/gold" method="post" class="building">
		<h1>Farm</h1>
		<h3>(earns 10-20 gold)</h3>
		<input type="hidden" name="gold" value="farm">
		<input type="submit" value="Find Gold!">
	</form>
	
	<form action="/gold" method="post" class="building">
		<h1>Cave</h1>
		<h3>(earns 5-10 gold)</h3>
		<input type="hidden" name="gold" value="cave">
		<input type="submit" value="Find Gold!">
	</form>
	<form action="/gold" method="post" class="building">
		<h1>House</h1>
		<h3>(earns 2-5 gold)</h3>
		<input type="hidden" name="gold" value="house">
		<input type="submit" value="Find Gold!">
	</form>
	<form action="/gold" method="post" class="building">
		<h1>Casino!</h1>
		<h3>(earns/takes 0-50 gold)</h3>
		<input type="hidden" name="gold" value="casino">
		<input type="submit" value="Find Gold!">
	</form>
	<h1>Activities</h1>
	<div class="act">
	<c:forEach var="act" items="${activities}">
	<c:if test="${act.contains('lost')}">
	<p class="lost">${act}</p>
	</c:if>
	<c:if test="${!act.contains('lost')}">
	<p class="win">${act}</p>
	</c:if>
	</c:forEach>
	</div>

</body>
</html>