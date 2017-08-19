<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>asdasda</title>
</head>
<body>
	<form method="POST" action="/products">
		<p>name: <input type="text" name="name"></p>
		<p>description: <input type="text" name="description"></p>
		<p>price: <input type="number" name="price" step="0.01"></p>
		<input type="submit" value="new product">
	</form>
</body>
</html>