<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>language</title>
</head>
<body>
	<h2><a href="/languages">Dashboard</a></h2>
	<h1>${lang.name }</h1>
	<h1>${lang.creator }</h1>
	<h1>${lang.currentVersion }</h1>
	<h2><a href="/languages/delete/${id}">delete</a></h2>
	<h2><a href="/languages/edit/${id}">edit</a></h2>
</body>
</html>