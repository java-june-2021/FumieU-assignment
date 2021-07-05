<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> 
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
	<body>
		<div id="wrapper">
			<div id=box>
		        <table class= "table">
		       		<thead>
		            <tr>
		                <th>Name</th>
		                <th>Creator</th>
		                <th>Version</th>
		                <th>Action</th>
			        </tr>
		            </thead>
		            <tbody>
						<c:forEach items="${languages}" var="language">
						<tr>
		                <td><c:out value="${language.name}"/></td>
		                <td><c:out value="${language.creator}"/></td>
		                <td><c:out value="${language.currentVersion}"/></td>
		                <td>
		                <a href="language/${language.id}">view</a>
		                <a href="language/delete/${language.id}">delete</a>
		                </td>
					  </c:forEach>
					</tbody>
	            </table>
         	</div>
            <div class="box">
	            <h1> Add a Language</h1>
	            <form action="/language/create" method="POST" class="mb-3">
	                <label for="name" class="form-label">Name</label>
	                <input type="text" name="name">
	                <label for="creator" class="form-label">Creator</label>
	                <input type="text" name="creator"></text>
	                <label for="currentVersion" class="form-label">Current Version</label>
	                <input type="text" name="currentVersion"></text>
	                <button type="submit" name='add'>Add</button>
	            </form>
        	</div>
        </div>
	</body>
</html>