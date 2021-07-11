<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register your License</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
 	<div id="wrapper">
        <h1> Register your License</h1>      
       <form:form action="/license/input" method="POST" modelAttribute="license">
      	<div class="form-group">
        <form:label path="person">Person</form:label>
        <form:errors path="person"/>
        <form:select class="form-control" path="person">
	        <c:forEach items="${person}" var="person">
	        	<option value="${person.id}">${person.firstName} ${person.lastName}</option>
	        </c:forEach>
	        </form:select>
		    </div>
			<div class="form-group">
	               <form:label path="state">State</form:label>
	               <form:errors path="state"/>
	               <form:input type="text" path="state"/>
			</div>
			<div class="form-group">
	               <form:label path="expirationDate">Expiration Date</form:label>
	               <form:errors path="expirationDate"/>
	               <form:input type="date" path="expirationDate"/>
			</div>
	               <button type="submit" name="register">Register</button>
        </form:form>   
    </div>
</body>
</html>