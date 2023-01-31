package school_management;

import java.io.IOException;
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
import javax.servlet.http.HttpSession;

@WebServlet("/show")
public class Teacher_show extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Query q=em.createQuery("select a from Teacher_insert_c a");
		List<Teacher_insert_c> s=q.getResultList();
		
		HttpSession hs=req.getSession();
		hs.setAttribute("Teacher_insert_c", s);
		
		RequestDispatcher rd=req.getRequestDispatcher("Teacher_show.jsp");
		rd.forward(req,resp);
	}

}
