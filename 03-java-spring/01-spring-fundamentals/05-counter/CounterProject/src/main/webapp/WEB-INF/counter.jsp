<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Counter</title>
	</head>
	<body>
		<div id=wrapper>
			<h1>You have visited <c:out value="${count}"/> Times</h1>
			<h4><a href="/">Visit main page?</a></h4>
			</br>
			<h4><a href="/counttwo">Visit twice</a></h4>
			</br>
			<h4><a href="/reset">Reset Session</a> </h4>
		</div>
	</body>
</html>