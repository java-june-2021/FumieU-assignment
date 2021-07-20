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
		<h1>Questions Dashboard</h1>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Questions</th>
								<th>Tags</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach items="${allqs}" var="q">
							<tr>
							<td><a href="/show/${q.id}">${q.qText}</a></td>
							<td>
							<p>
							<c:forEach items="${q.qTag}" var="t">
							${t.subject},
							 </c:forEach>
							 </p>
							 </td>
						    </tr>

		                    </c:forEach>
						</tbody>
					</table>
				<a href="/new">New Question</a>
			
	
	
	
	</div>
</body>
</html>