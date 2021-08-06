<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
	</head>
	<body>
		<p class="error"><c:out value="${error}"/></p>
		<p>What is the code?</p>
		<form method="POST" action="/guessCode">
			<input type="text" name="code"/>
			<button type="submit">Try Code</button>
		</form>
		
	</body>
</html>