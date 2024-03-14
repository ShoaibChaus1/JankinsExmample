package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		EmployeeBean eb=new LoginDAO().login(req.getParameter("uname"), req.getParameter("pword"));
		
		if(eb==null)
		{
			req.setAttribute("msg", "Invalid Username or Password");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs=req.getSession();
			hs.setAttribute("ebean", eb);
			req.setAttribute("msg", "Login Successfully");
			req.getRequestDispatcher("login.jsp").forward(req, res);
			
		}
	}
	

}
