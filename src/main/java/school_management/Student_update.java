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

@WebServlet("/s_update")
public class Student_update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int Id=Integer.parseInt(req.getParameter("Id"));
		String Student_name=req.getParameter("Student_name");
			String Student_email=req.getParameter("Student_email");
		String Branch=req.getParameter("Branch");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		Student_insert_c c=em.find(Student_insert_c.class, Id);
		c.setStudent_name(Student_name);
		c.setBranch(Branch);
		c.setStudent_email(Student_email);
		
		et.begin();
		em.merge(c);
		et.commit();
		RequestDispatcher rd=req.getRequestDispatcher("Student.html");
		rd.forward(req,resp);
	}

}
