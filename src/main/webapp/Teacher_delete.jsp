<%@page import="school_management.Teacher_insert_c"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String Id1=request.getParameter("Id");
int Id = Integer.parseInt(Id1);
 
EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
EntityManager em=emf.createEntityManager();

Teacher_insert_c c=em.find(Teacher_insert_c.class, Id);

%>

<form action="delete" method="post">
       Id: <input type="text" value="<%=c.getId()%>" name="Id">
		Teacher_name: <input type="text" value="<%=c.getTeacher_name()%>" name="Teacher_name">
		Teacher_email: <input type="text" value="<%=c.getTeacher_email()%>" name="Teacher_email">
		Subject: <input type="text" value="<%=c.getSubject()%>"name="subject">
		<input type="submit">
		</form>

</body>
</html>