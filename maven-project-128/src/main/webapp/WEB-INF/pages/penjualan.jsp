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
<script type="text/javascript" src="${root}resources/js/penjualan.js"></script>
</head>
<body>
	<div class="container">
		<form action="${root}penjualan/save" method="POST">
			<input type="text" placeholder="Masukkan No penjualan" name="no_penjualan" /><br/>
			<input type="text" placeholder="Masukkan Lokasi" name="location" /><br/>
			<select class="form-control" name="customer.id">
		   	<c:forEach items="${customers}" var="customer">
		   		<option value="${customer.id}">${customer.name}, ${customer.email}</option>
		   	</c:forEach>
		   </select>
			<input type="submit" name="submit" value="save"/>
		</form>
		<p/>
		<hr/>
		<table class="table table-striped table-hover table-bordered" style="border-collapse: collapse;" border=1>
			<thead>
				<tr class="bg-info">
					<th scope="col">No Penjualan</th>
					<th scope="col">Lokasi</th>
					<th scop="col">Pembeli</th>
					<th scop="col">Email Pembeli</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
		<c:forEach items="${listPenjualan}" var="penjualan">
			<tr scope="row">
				<td>${penjualan.no_penjualan}</td>
				<td>${penjualan.location}</td>
				<td>${penjualan.customer.name}</td>
				<td>${penjualan.customer.email}</td>
				<td>
					<a data-id="${penjualan.id}" class="del btn btn-danger btn-sm" href="#">Delete</a>
					<a data-id="${penjualan.id}" class="upd btn btn-warning btn-sm" href="#">Update</a>
					<a data-id="${penjualan.id}" customer-id="${penjualan.customer.id}" class="select-btn btn btn-warning btn-sm" href="#">Select</a>
				</td>
			</tr>
		</c:forEach>
			</tbody>
		</table>
		
		<h3>Item yang dipilih : </h3>
		<table id="table-selection" class="table table-striped table-hover table-bordered" style="border-collapse: collapse;" border=1>
			<thead>
				<tr class="bg-info">
					<th scope="col">No Penjualan</th>
					<th scope="col">Lokasi</th>
					<th scop="col">Pembeli</th>
					<th scop="col">Email Pembeli</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
		<a href="#" id="click-beli" class='btn btn-primary' >Beli!!</a>
	</div><!-- bootstrap container -->
	<%@ include file="/resources/modal/update-penjualan-modal.html" %>
</body>
</html>