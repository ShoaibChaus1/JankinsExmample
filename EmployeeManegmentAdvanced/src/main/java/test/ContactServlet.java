package test;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/contact")
public class ContactServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
		    req.setAttribute("msg","Session Expired...");
		    req.getRequestDispatcher("Home.jsp").forward(req, resp);
		}
		else
		{
			EmployeeBean eb=(EmployeeBean)hs.getAttribute("ebean");
			
			
			ContactBean cb=new ContactDAO().retriveContact(eb.getUname());
			
			
			hs.setAttribute("cbean", cb);
			System.out.println(cb);
			if(cb==null)
			{
				req.getRequestDispatcher("addcontact.html").forward(req, resp);
				
			}
			else
			{
				req.getRequestDispatcher("contact.jsp").forward(req, resp);
			}
		}
		
	}

	
		
	
	
	

	
}
