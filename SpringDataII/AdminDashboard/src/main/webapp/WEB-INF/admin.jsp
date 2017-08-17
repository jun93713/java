<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<body>
    <h1>Welcome Page <c:out value="${currentUser.firstName}"></c:out></h1>
    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
    <c:forEach var="user" items="${users }">
    		<h1>${user.firstName } ${user.lastName } | ${user.username } | 
    		<c:if test="${user.roles.get(0).name.equals('ROLE_ADMIN') }"> <span>admin</span> </c:if> 
    		<c:if test="${user.roles.get(0).name.equals('ROLE_USER') }"> <a href="">delete</a> <a href="">make-admin</a></c:if> 
    		</h1>

    </c:forEach>
</body>
</html>