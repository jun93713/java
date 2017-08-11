<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>languages</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>action</th>
		</tr>
		<c:forEach var="lang" items="${langs}">
			<tr>
				<th><a href="/languages/${lang.id}"><c:out value="${lang.name }"></c:out></a></th>
				<th><c:out value="${lang.creator }"></c:out></th>
				<th><c:out value="${lang.currentVersion }"></c:out></th>
				<th>
					<a href="/languages/delete/${lang.id}">delete</a>
					<a href="/languages/edit/${lang.id}">edit</a>
				</th>
			</tr>
		</c:forEach>
	</table>
	
	<form:form method="POST" action="/language/new" modelAttribute="language">
		<form:hidden path="id"/>
	
	    <form:label path="name">Name
	    <form:errors path="name"/>
	    <form:input path="name"/></form:label>
	    
	    <form:label path="creator">Creator
	    <form:errors path="creator"/>
	    <form:input path="creator"/></form:label>
	    
	    <form:label path="currentVersion">Version
	    <form:errors path="currentVersion"/>
	    <form:input path="currentVersion" value="1.0"/></form:label>
	    
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>