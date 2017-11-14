<%@page import="java.util.List"%>
<%@page import="com.xsis.web128.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:url value="./" var="root" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${root}employee/save" method="POST">
		<input type="text" placeholder="enter your name" name="name" /><br/>
		<input type="text" placeholder="enter your address" name="address" /><br/>
		<input type="text" placeholder="enter your birth day" name="birthDay" /><br/>
		<input type="text" placeholder="enter your email" name="email" /><br/>
		<input type="submit" name="submit" value="save"/>
	</form>
	<table>
		<thead>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
		</thead>
		<tbody>
	<c:forEach items="${employees}" var="emp">
		<tr>
			<td>${emp.name}</td><td>${emp.address}</td><td>${emp.email}</td>
		</tr>
	</c:forEach>
		</tbody>
	</table>
	<% 
		/*// List<Employee> employees = (List<Employee>)request.getAttribute("employees"); 
		for(Employee emp : employees){
			out.print("name : "+ emp.getName());
		} */
	%>
</body>
</html>