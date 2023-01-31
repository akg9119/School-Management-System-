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

@WebServlet("/s_insert")
public class Student_insert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int Id=Integer.parseInt(req.getParameter("Id"));
		String Student_name=req.getParameter("Student_name");
		String Branch=req.getParameter("Branch");
		String Student_email=req.getParameter("Student_email");
	
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		
		Student_insert_c c=new Student_insert_c();
		c.setId(Id);
		c.setBranch(Branch);
		c.setStudent_email(Student_email);
		c.setStudent_name(Student_name);
		
		et.begin();
		em.persist(c);
		et.commit();
		RequestDispatcher rd=req.getRequestDispatcher("Student.html");
		rd.forward(req,resp);
	}

}
