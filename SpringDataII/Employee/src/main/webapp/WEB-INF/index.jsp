<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lllll</title>
</head>
<body>
	<form:form method="POST" action="/new" modelAttribute="employee">
		<p>add employee</p>
		<p>
            <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName"/>
        </p>
        <p>
            <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName"/>
        </p>
        <input type="submit" value="add"/>
	</form:form>
	
	<table>
		<tr>
			<th>Name</th>
			<th>Manager/Employees</th>
			<th>action</th>
		</tr>
		<c:forEach var="emp" items="${employees }">
			<tr>
				<td>${emp.firstName } ${emp.lastName }</td>
				<td>
					<c:if test="${emp.manager != null }">
					Manager:${emp.manager.firstName } 
					</c:if>
					<c:if test="${!empty emp.employees }">
						Employees:
						<c:forEach var="aaa" items="${emp.employees }">
							${aaa.firstName } 
						</c:forEach>
					</c:if>
				</td>
				<td>
					<form method="POST" action="/manager">
						<input type="hidden" name="manager" value="${emp.id }">
						<select name="employee">
						
							<c:forEach var="employee" items="${employees }">
								<c:if test="${emp.id != employee.id && !emp.employees.contains(employee) }">
									<option value="${employee.id }">${employee.firstName }</option>
								</c:if>
							</c:forEach>
						</select>
						<input type="submit" value="add employee">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>