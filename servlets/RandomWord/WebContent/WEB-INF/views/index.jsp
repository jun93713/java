<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Word Generator</title>
</head>
<body>
	<h3>You have generated a word ${counter} times.</h3>
	<h1>${word}</h1>
	<form action="/RandomWord/Word">
		<input type="submit" value="Generate">
	</form>
	<h3>The last time you generated a word was:</h3>
	<h1>${time}</h1>
</body>
</html>