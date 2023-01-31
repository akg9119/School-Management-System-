<%@page import="school_management.Student_insert_c"%>
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


Student_insert_c c=em.find(Student_insert_c.class, Id);
%>

<form action="s_delete" method="post">
        Id: <input type="text" value="<%=c.getId()%>" name="Id">
		Student_name: <input type="text" value="<%=c.getStudent_name()%>" name="Student_name">
		Student_email: <input type="text" value="<%=c.getStudent_email()%>" name="Student_email">
		Branch: <input type="text" value="<%=c.getBranch()%>"name="Branch">
		<input type="submit">
		</form>

</body>
</html>