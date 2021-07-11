<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  					
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register your name</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
      <div id="wrapper">
	        <h1> Register Your Name</h1>
	        <form:form action="/create/person" method="POST" class="mb-3" modelAttribute="person">
	            <form:label path="firstName" class="form-label">First Name</form:label>
	            <form:errors path="firstName"/>
	            <form:input type="text" path="firstName"/>
	            
	            <form:label path="lastName" class="form-label">Last Name</form:label>
	            <form:errors path="lastName"/>
	            <form:input type="text" path="lastName"/>
	            </br>
	            
	            <button type="submit" name="add" class="btn btn-primary">Register</button>
	        </form:form>
   	  </div>
</body>
</html>