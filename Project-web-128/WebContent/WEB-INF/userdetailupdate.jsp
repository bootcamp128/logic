<%@page import="com.xsis.trainingweb.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	User user = (User)request.getAttribute("user");
%>
<form action="userupdate" method="POST">
	<input type="hidden" name="user-id" value="<% out.print(user.getId());%>"/>
	<table>
		<tr>
			<td>Name : </td>
<td><input type="text" name="text-name" value="<% out.print(user.getName());%>" ></td>
		</tr>
		<tr>
			<td>Email : </td>
<td><input type="text" name="text-email" value="<% out.print(user.getEmail());%>" ></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="text" name="text-password" value="" ></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" name="sub-update" value="Update" ></td>
		</tr>
	</table>
</form>
</body>
</html>