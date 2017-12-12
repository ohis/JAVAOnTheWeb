<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clicker</title>
</head>
<body>
  <h1>Hello am here</h1>
  
  
  <a href="Clicker"><button>Click Me</button> </a>
  <h1>You have clicked this button <%= session.getAttribute("clicks") %> times</h1>
   
</body>
</html>