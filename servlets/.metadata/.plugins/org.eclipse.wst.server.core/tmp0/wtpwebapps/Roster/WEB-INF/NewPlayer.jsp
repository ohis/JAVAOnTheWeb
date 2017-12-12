<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Player</title>
</head>
<body>
	<h1>Add a new Player to ${teamName}</h1>
	
	<form action="players" method="post">
		<p>
			<label for="firstName">First Name:</label>
			<input type="text" name="firstName"/>
		</p>
		<p>
			<label for="lastName">Last Name:</label>
			<input type="text" name="lastName"/>
		</p>
		<p>
			<label for="age">Age:</label>
			<input type="number" name="age"/>
		</p>
		<input type="hidden" name="teamId" value="${teamId}" />
		<input type="submit" value="Create Player"/>
	</form>
</body>
</html>