<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Team Details</title>
</head>
<body>
  <h1>${team.getName()}</h1>
  <a href="players?id=${teamId}">New Player</a> | <a href="Home">Home</a>
  <table>
		  <thead>
		    <tr>
	            <td>First Name</td>	 
	            <td>Last Name</td>	 
	             <td>Age</td>	 
	             <td>Action</td>	    
		    </tr>
		  </thead>
		 <tbody>
		   <c:forEach var="player" items="${team.getPlayers()}" varStatus="loop">
		   <tr>
		   <td><c:out value="${player.getFirstName() }"></c:out></td>
		   <td><c:out value="${player.getLastName() }"></c:out></td>
		   <td><c:out value="${player.getAge() }"></c:out></td>
		   <td><a href="deletePlayer?teamId=${teamId}&playerId=${loop.index}">Delete </a></td>
		   </tr>
		   </c:forEach>
		 </tbody>
  </table>
</body>
</html>