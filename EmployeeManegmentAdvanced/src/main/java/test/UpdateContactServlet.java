package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/updateContact")
public class UpdateContactServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
	   HttpSession hs=req.getSession(false);
	   
	   if(hs==null)
	   {
		   req.setAttribute("msg", "Session Expired...");
		   req.getRequestDispatcher("Home.jsp").forward(req, res);
	   }
	   else
	   {
		   ContactBean cb=new ContactBean();
		   cb.setPmid(req.getParameter("pmid"));
		   cb.setCmid(req.getParameter("cmid"));
		   cb.setPhno(Long.parseLong(req.getParameter("phno")));
		   cb.setAphno(Long.parseLong(req.getParameter("aphno")));
		   
		   EmployeeBean eb=(EmployeeBean)hs.getAttribute("ebean");
		   String uName=eb.getUname();
		   
		   int k=new UpdateContactDAO().updateContact(uName, cb);
		   
		   if(k>0)
		   {
			   res.sendRedirect("contact");
		   }
		   
		   
	   }
	}
	

}
