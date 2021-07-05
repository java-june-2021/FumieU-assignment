<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
<title>Edit</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
	<div id="wrapper">
        <h1> Edit this Language</h1>
        
        <form:form action="/language/${language.id}" method="POST" modelAttribute="language">
        <div class="form-group">
            <form:label path="name">Name</form:label>
            <form:errors path="name"/>
            <form:input path="name"/>
		</div>
		<div class="form-group">
               <form:label path="creator">Creator</form:label>
               <form:errors path="creator"/>
               <form:input path="creator"/>
		</div>
		<div class="form-group">
               <form:label path="currentVersion">Current Version</form:label>
               <form:errors path="currentVersion"/>
               <form:input path="currentVersion"/>
		</div>
               <button type="submit" name="edit">Edit</button>
        </form:form>
  
    </div>
</body>
</html>