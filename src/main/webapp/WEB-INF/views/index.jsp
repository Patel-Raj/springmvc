<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Habits tracker</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
		
	%>
	<h1> Welcome <%=name%> to Habit tracker !</h1> 
	<h2> Let's build upon good habits and break bad ones. </h2> 
	
	<h2>Your friends are already here !!</h2>
</body>
</html>