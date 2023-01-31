package school_management;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class Teacher_update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int Id=Integer.parseInt(req.getParameter("Id"));
	String Teacher_name=req.getParameter("Teacher_name");
		String Teacher_email=req.getParameter("Teacher_email");
	String Subject=req.getParameter("Subject");
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	
	Teacher_insert_c c=em.find(Teacher_insert_c.class, Id);
	c.setTeacher_name(Teacher_name);
	c.setSubject(Subject);
	c.setTeacher_email(Teacher_email);
	
	et.begin();
	em.merge(c);
	et.commit();
	RequestDispatcher rd=req.getRequestDispatcher("Teacher.html");
	rd.forward(req,resp);
	}
}
