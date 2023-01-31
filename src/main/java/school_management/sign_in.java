package school_management;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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


@WebServlet("/sing_in")


public class sign_in extends HttpServlet {
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("school_management");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String Name=req.getParameter("Name");
		String Email=req.getParameter("Email");
		String phone_no=req.getParameter("Phone_no");
		String password=req.getParameter("Password");
		
		principal p=new principal();
		p.setName(Name);
		p.setEmail(Email);
		p.setPassword(password);
		p.setPhone_no(phone_no);
		
		et.begin();
		em.persist(p);
		et.commit();
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.forward(req, resp);
		
		
		
		
		
		
		
	
	}

}
