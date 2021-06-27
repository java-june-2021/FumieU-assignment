<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Dojo Survey</title>
</head>
<body>
    <div id="wrapper">

    <div id="box">
        <form action="/input" method=POST>
            <label for="your_name">Your Name</label>
            <input type="text" name="name">
            </br>
            <label for="dojo_location">Dojo Location:</label>
            </br>
            <select name="location" aria-label="Default select example">
            	<option selected>Select your location</option>
                <option value="bellevue">Bellevue</option>
                <option value="san_jose">San Jose</option>
                <option value="new_york">New York</option>
                <option value="new_york">Chicago</option>
                <option value="new_york">Tronto</option>
            </select>
			</br>
			</br>
           <label for="language">Favorite Language:</label>
            
			<div class="form-check">
			<input class="form-check-input" type="radio" name="language" id="python">
			<label class="form-check-label" for="python">
			Python
			</label>
			</div>
			<div class="form-check">
			<input class="form-check-input" type="radio" name="language" id="java">
			<label class="form-check-label" for="java">
			JAVA
			</label>
			</div>
			
			<div class="form-check">
			<input class="form-check-input" type="radio" name="language" id="javascript">
			<label class="form-check-label" for="javascript">
			Java Script
			</label>
			</div>
			
            <div class="form-check">
			<input class="form-check-input" type="radio" name="language" id="other">
			<label class="form-check-label" for="other">
			Other
			</label>
			</div>
			</br>
			</br>
			
			<p>Please leave your comment:</p>
            <div class="input-group">
			 <span class="input-group-text">Comment</span>
			 <textarea class="form-control" aria-label="With textarea" name="comment"></textarea>
			</div>
            </br>
            </br>
            <div class="col-12">
    		<button class="btn btn-primary" type="submit">Submit</button>
  			</div>
        </form>
    </div>    
    </div>
</body>
</html>