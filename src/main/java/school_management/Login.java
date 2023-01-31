package school_management;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Email=req.getParameter("Email");
    	String password=req.getParameter("password");
    	
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
    	EntityManager em=emf.createEntityManager();
 
    	Query q=em.createQuery("select u from principal u where u.Email=?1 and u.password=?2");
		q.setParameter(1, Email);
		q.setParameter(2, password);
		
		List<principal> user=q.getResultList();
		if(user.size()>0) {
			RequestDispatcher rd=req.getRequestDispatcher("Teacher_and_Student.html");
			rd.forward(req,resp);
		}
		else {
			PrintWriter pw=resp.getWriter();
			pw.write("Invalid Credentials");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req,resp);
			
		}
 }
	    	
}
