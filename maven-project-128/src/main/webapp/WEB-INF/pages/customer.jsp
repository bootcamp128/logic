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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script type="text/javascript" src="${root}resources/js/jquery-3.2.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<script type="text/javascript" src="${root}resources/js/myscript.js"></script>
</head>
<body>
	<div class="container">
		<form action="${root}employee/save" method="POST">
			<input type="text" placeholder="enter your name" name="name" /><br/>
			<input type="text" placeholder="enter your address" name="address" /><br/>
			<input type="text" placeholder="enter your birth day" name="birthDay" /><br/>
			<input type="text" placeholder="enter your email" name="email" /><br/>
			<input type="submit" name="submit" value="save"/>
		</form>
		<p/>
		<hr/>
		<table class="table table-striped table-hover table-bordered" style="border-collapse: collapse;" border=1>
			<thead>
				<tr class="bg-info">
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scop="col">Contact Number</th>
					<th scop="col">Penjualan</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
		<c:forEach items="${customers}" var="customer">
			<tr scope="row">
				<td>${customer.name}</td>
				<td>${customer.email}</td>
				<td>${customer.noContact}</td>
				<td>
					<c:forEach items="${customer.listPenjualan}" var="penjualan">
						<a href="#">${penjualan.no_penjualan }</a><br/>
					</c:forEach>
				</td>
				<td>
					<a data-id="${penjualan.id}" class="del btn btn-danger btn-sm" href="#">Delete</a>
					<a data-id="${penjualan.id}" class="upd btn btn-warning btn-sm" href="#">Update</a>
				</td>
			</tr>
		</c:forEach>
			</tbody>
		</table>
	</div><!-- bootstrap container -->
	<%@ include file="/resources/modal/mymodal.html" %>
</body>
</html>