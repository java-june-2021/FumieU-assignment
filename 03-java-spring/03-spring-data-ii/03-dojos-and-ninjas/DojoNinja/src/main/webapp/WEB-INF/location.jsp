<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> 
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div id="wrapper">
		<h2><c:out value="${dojo.name}"></c:out> Location Ninjas</h2>
	   	<table class= "table">
	      <thead>
	          <tr>
	              <th>First Name</th>
	              <th>Last Name</th>
	              <th>Age</th>
	       </tr>
	       </thead>
	       <tbody>

				<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
		              <td><c:out value="${ninja.firstName}"/></td>
		              <td><c:out value="${ninja.lastName}"/></td>
		              <td><c:out value="${ninja.age}"/></td>
		        </c:forEach>
		  </tbody>
	     </table>
 	 </div>
</body>
</html>