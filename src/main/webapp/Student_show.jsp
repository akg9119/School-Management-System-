<%@page import="school_management.Student_insert_c"%>
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
<%List<Student_insert_c> t=(List)session.getAttribute("Student_insert_c"); %>
<table cellpadding="20px" border="1">
<th>Id</th>
<th>Student_name</th>
<th>Branch</th>
<th>Student_email</th>
<th>Phone_no</th>

<%for(Student_insert_c s:t){ %>
<tr align="center">
<td><%= s.getId() %></td>
<td><%= s.getStudent_name() %></td>
<td><%= s.getBranch() %></td>
<td><%= s.getStudent_email() %></td>
</tr><% 
}  %>



</table>

</body>
</html>