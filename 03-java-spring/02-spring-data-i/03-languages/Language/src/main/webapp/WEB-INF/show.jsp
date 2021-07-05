<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Language</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> 
		<link rel="stylesheet" type="text/css" href="CSS/style.css">
	</head>
	<body>
	  <div id="wrapper">
		<h1><c:out value="${language.name}"/></h1>
		<p>Creator: <c:out value="${language.creator}"/></p>
		<p>Current Version: <c:out value="${language.currentVersion}"/></p>
		</br>
		<a href="update/${language.id}" class="btn btn-primary">Edit This Book</a>
		</br>
		</br>
	    <a href="delete/${language.id}" class="btn btn-primary">Delete This Book</a>
		
	  </div>
	</body>
</html>