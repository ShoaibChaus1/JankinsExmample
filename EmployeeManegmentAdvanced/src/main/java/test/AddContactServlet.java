package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/addcontact")
public class AddContactServlet extends HttpServlet
{

	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		HttpSession hs=req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired..");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			ContactBean cb=new ContactBean();
			EmployeeBean eb=(EmployeeBean)hs.getAttribute("ebean");
			System.out.println(eb.getUname());
			cb.setUname(eb.getUname());
			cb.setPmid(req.getParameter("pmid"));
			cb.setCmid(req.getParameter("cmid"));
			cb.setPhno(Long.parseLong(req.getParameter("phno")));
			cb.setAphno(Long.parseLong(req.getParameter("aphno")));
			
			int k=new AddContactDAO().addContact(cb);
			
			
			if(k>0)
			{
//				req.setAttribute("msg", "Please Click Below link ");
//				req.getRequestDispatcher("addcontact.jsp").forward(req, res);
				
				res.sendRedirect("contact");
			}
			
		}
	}

	
	
	
	

}
