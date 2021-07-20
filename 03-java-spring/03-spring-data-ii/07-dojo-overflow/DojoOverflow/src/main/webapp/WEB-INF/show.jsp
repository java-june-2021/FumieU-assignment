<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<div id="wrapper">
			<h1>${question.qText }</h1>
			<p>
			<c:forEach items="${question.qTag}" var="tag">
			${tag.subject},
			</c:forEach>
			</p>
		    <hr>
		    <ul>
		    <h2>Answers:</h2>
		    <c:forEach items="${question.answer}" var="answer">
		    <li>${answer.aText}</li>
		    </c:forEach>
		    </ul>

		    <form:form method="POST" action="/addAnswer" modelAttribute="answer">
		    <p>
		    <form:label path="aText">Add Answer:</form:label>
		    <form:errors path="aText"/>
		    <form:input path="aText"/>
		    <form:hidden path="quest" value="${question.id}"/>
		    
		    </p>
		    <button> Add</button>
		    </form:form>
		
		
		</div>
	</body>
</html>