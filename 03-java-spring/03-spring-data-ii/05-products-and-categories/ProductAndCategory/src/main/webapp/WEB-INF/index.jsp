<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> 
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>
	<div id="wrapper">
		<h1>New Product</h1>
		<form:form action="/product/new/process" method="POST" modelAttribute="product">
			<div class="mb-3">
			  <form:label path="productName" class="form-label">Product Name</form:label>
			  <form:errors path="productName"/>
			  <form:input path="productName" type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter product name"/>
			</div>
			<div class="mb-3">
			  <form:label path="description" class="form-label">Product Description</form:label>
			  <form:errors path="description"/>
			  <form:input path="description" type="textarea" class="form-control" id="formGroupExampleInput" placeholder="Enter product description"/>
			</div>
			<div class="mb-3">
			  <form:label path="price" class="form-label">Product Price</form:label>
			  <form:errors path="price"/>
			  <form:input path="price" type="number" class="form-control" id="formGroupExampleInput" placeholder="Enter product price"/>
			</div>
			<input class="btn btn-primary" type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>