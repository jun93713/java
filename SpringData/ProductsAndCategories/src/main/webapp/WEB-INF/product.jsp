<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<h1>${product.name }</h1>
	<h3>Categories</h3>
	<ul>
		<c:forEach var="cate" items="${product.categories }">
			<li>${cate.name }</li>
		</c:forEach>
	</ul>
	
	<form method="POST" action="/products/${product.id }/new" >
		<select name="category">
			<p>Add Product:</p>
			<c:forEach var="cate" items="${categories }">
				<c:if test="${!product.categories.contains(cate) }">
					<option value="${cate.id }">${cate.name }</option>
				</c:if>
			</c:forEach>
		</select>
		<input type="submit" value="add">
	</form>
</body>
</html>