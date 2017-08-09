<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dojo Survey Index</title>
</head>
<body>
	<form action="/process" method="post">
		<p>Your Name: <input type="text" name="name"></p>
		<p>
			Dojo Location:
			<select name="location">
				<option value="San Jose">San Jose</option>
				<option value="Seattle">Seattle</option>
				<option value="Burbank">Burbank</option>
			</select>
		</p>
		<p>
			Favorite Language:
			<select name="lang">
				<option value="Python">Python</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Java">Java</option>
			</select>
		</p>
		<p>Comment: <textarea rows="4" cols="100" name="comment"></textarea></p>
		<input type="submit" value="submit">
	</form>
</body>
</html>