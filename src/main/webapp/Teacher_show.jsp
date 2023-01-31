<%@page import="school_management.Teacher_insert_c"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Teacher_insert_c> t=(List)session.getAttribute("Teacher_insert_c"); %>
<table cellpadding="20px" border="1">
<th>Id</th>
<th>Teacher_name</th>
<th>Subject</th>
<th>Teacher_email</th>
<th>Phone_no</th>

<%for(Teacher_insert_c s:t){ %>
<tr align="center">
<td><%= s.getId() %></td>
<td><%= s.getTeacher_name() %></td>
<td><%= s.getTeacher_email() %></td>
<td><%= s.getSubject
() %></td>
<td><%= s.getPhone_no() %></td>
</tr><% 
}  %>



</body>
</html>