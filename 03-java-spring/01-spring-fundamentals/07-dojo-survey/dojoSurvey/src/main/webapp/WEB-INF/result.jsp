<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div id="wrapper">
	<div id="box">
        <h2>Submitted Info</h2>
        <p>Name: <c:out value="${name}"/></p>
        <p>Location: <c:out value="${location}"/></p>
        <p>Language: <c:out value="${language}"/></p>
        <p>Comment: <c:out value="${comment}"/></p>
		</br>
		</br>
		</br>
		 <form action='/clear' method=POST>
		  <button type="submit" name='clear'>Clear</button>
        </form>
	</div>
    </div>
</body>
</html>