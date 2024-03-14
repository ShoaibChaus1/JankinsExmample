package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ragister")
public class RagisterServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		EmployeeBean eb=new EmployeeBean();
		eb.setUname(req.getParameter("uname"));
		String pword=req.getParameter("pword");
		String cPword=req.getParameter("cpword");
		if(pword.equals(cPword))
		{
			eb.setPword(pword);
		}
		else
		{
			req.setAttribute("msg", "Entered Password no Matched");
			req.getRequestDispatcher("ragisterError.jsp").forward(req, res);
		}
		eb.setFname(req.getParameter("fname"));
		eb.setLname(req.getParameter("lname"));
		eb.setAddr(req.getParameter("addr"));
		eb.setMid(req.getParameter("mid"));
		eb.setPhno(Long.parseLong(req.getParameter("phno")));
		
		int k=new RagisterDAO().register(eb);
		
		if(k>0)
		{
//			req.setAttribute("msg", "Ragistered Successfully");
//			req.getRequestDispatcher("ragister.jsp").forward(req, res);
			
			res.sendRedirect("login.html");
		}
		
	}
	

}
