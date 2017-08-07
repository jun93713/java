<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Pets/Dog">
    <h1>Dog</h1>
    <p>Name: <input type="text" name="name"></p>
    <p>Breed: <input type="text" name="breed"></p>
    <p>Weight(lb):<input type="text" name="weight"></p>
    <input type="submit" value="submit">
</form>
<form action="/Pets/Cat">
    <h1>Cat</h1>
    <p>Name: <input type="text" name="name"></p>
    <p>Breed: <input type="text" name="breed"></p>
    <p>Weight(lb):<input type="text" name="weight"></p>
    <input type="submit" value="submit">
</form>
</body>
</html>