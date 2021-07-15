<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="UTF-8">
<title>Product Category</title>
</head>
<body>
	<div id="wrapper">
		<h2>${product.productName}</h2>
		<div class="box">
			<h3>Categories:</h3>
			<ul>
			<c:forEach items="${product.categories}" var="c">
				<li>${c.categoryName}</li>			
			</c:forEach>
			</ul>
		</div>
 		<div class="box">
		<form:form method="POST" action="/product/category/process" modelAttribute="category">
			<div class="form">
				<form:label path="categoryName">Category Name:</form:label>
				<form:errors path="categoryName"/>
				<form:select path="categoryName">
					<c:forEach items="${notInProducts}" var="cat">
						<option value="${cat.id}">${cat.categoryName}</option>
					</c:forEach>
				</form:select>
			</div>
			<button>Add me</button>
		</form:form> 
		

		</div>
	</div>
</body>
</html>