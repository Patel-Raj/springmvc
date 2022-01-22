<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	This is about page.
	<%
		String name = (String) request.getAttribute("name");
		List<String> friends = (ArrayList) request.getAttribute("friends");
	%>
	<h1>My name is : <%= name %></h1>
	<%
		for(String n : friends) {
	%>
		<h1>Friend : <%=n %></h1>	
	<% 
		}
	%>	
</body>
</html>