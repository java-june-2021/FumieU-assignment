<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
	<h1>New Ninja</h1>
	<hr>
	<form:form method="POST" action="/add/ninja" modelAttribute="ninja">
			<div class="form">
				<form:label path="dojo">Dojo Name:</form:label>
				<form:errors path="dojo"/>
				<form:select path="dojo">
					<c:forEach items="${dojo}" var="dojo">
						<option value="${dojo.id}">${dojo.name}</option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<form:label path="firstName">First Name:</form:label>
				<form:errors path="firstName"/>
				<form:input path="firstName"/>
			</div>
			<div class="form-group">
				<form:label path="lastName">Last Name:</form:label>
				<form:errors path="lastName"/>
				<form:input path="lastName"/>
			</div>
			<div class="form-group">
				<form:label path="age">Age:</form:label>
				<form:errors path="age"/>
				<form:input path="age"/>
			</div>
			<button>Add me</button>
		</form:form>
	</div>
</body>
</body>
</html>