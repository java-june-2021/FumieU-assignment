<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> 
</head>
<body>
	<div id="wrapper">
		<h1>New Dojo</h1>
		<form:form action="/new/dojo" method="POST"  modelAttribute="dojo">
			<div class="mb-3">
			  <form:label path="name" class="form-label">Dojo Name</form:label>
			  <form:errors path="name"/>
			  <form:input path="name" type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter your Dojo name"/>
			</div>
			 <button type="submit" name="create">create</button>
		</form:form>
	</div>
</body>
</html>