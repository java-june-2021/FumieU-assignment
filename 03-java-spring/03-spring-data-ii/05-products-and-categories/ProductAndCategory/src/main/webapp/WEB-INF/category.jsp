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
		<h1>New Category</h1>
		<form:form action="/category/new/process" method="POST" modelAttribute="category">
			<div class="mb-3">
			  <form:label path="categoryName" class="form-label">Category Name</form:label>
			  <form:errors path="categoryName"/>
			  <form:input path="categoryName" type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter category name"/>
			</div>

			<input class="btn btn-primary" type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>