<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Practicing Post</title>
</head>
<body>
  <h1>Practicing post</h1>
  <form action="Test" method="post">
    <label>Name</label> 
     <input type="text" name="Name">
     <input type="submit" value="Submit">
  </form>
  
  <h1><%String name = (String)request.getSession().getAttribute("N") ;%></h1>
  <h1>My name is <%=name %></h1>
</body>
</html>