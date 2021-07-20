<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="UTF-8">
<title>Enter your question</title>
</head>
<body>
<div id="wrapper">
	<h1>What is your question?</h1>
			<form:form action="/new/question" method="POST"  modelAttribute="question">
				<div class="mb-3">
				  <form:label path="qText" class="form-label">Question:</form:label>
				  <form:errors path="qText"/>
				  <form:input path="qText" type="textarea" class="form-control" id="formGroupExampleInput" placeholder="Ask your question"/>
				</div>
				  <div class="mb-3">	
			      <form:label path="tagsFromFrontEnd" class="form-label">Tags:</form:label>
				  <form:errors path="tagsFromFrontEnd"/>
				  <form:input path="tagsFromFrontEnd" type="text" class="form-control" id="formGroupExampleInput" placeholder="Add Tag"/>
				 </div> 
				 <button type="submit" name="submit">submit</button>
			</form:form>
			


</div>
</body>
</html>
