<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css"> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Input code</title>
	</head>
	<body>
		<div id=wrapper>
			<div id=box>
				<form method="POST" action="/input" name="input">
				<span><c:out value="${ error }" /></span> 
	
				<h1>What is the code?</h1>
				<div id=input><input type="text" name="input">
				<button>Try Code</button>
				</form>
			</div>
		</div>
	</body>
</html>