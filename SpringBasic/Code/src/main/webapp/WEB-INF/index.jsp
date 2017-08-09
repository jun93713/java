<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${error!=null}">
	<h1 style="color: red">${error}</h1>
	</c:if>
	<h1>What is the code?</h1>
	<form action="/process" method="post">
		<input type="text" name="code">
		<input type="submit" value="Try Code">
	</form>
</body>
</html>