<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show License</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<body>
	<div id="wrapper">
		<h1>${ person.firstName } ${ person.lastName }</h1>
		<p>License Number 00000${ license.getId() }</p>
		<p>Expiration Date ${ license.getDateFormated() }</p>
	</div>
</body>
</body>
</html>