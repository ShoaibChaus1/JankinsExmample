package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/education")
public class EducationServlet extends HttpServlet 
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   HttpSession hs=req.getSession(false);
	   
	   if(hs==null)
	   {
		   req.setAttribute("msg", "Session Expired...");
		   req.getRequestDispatcher("Home.jsp").forward(req, resp);
	   }
	   else
	   {
		   EmployeeBean eb=(EmployeeBean) hs.getAttribute("ebean");
		   
		   EducationBean edb=new RetriveEducationDAO().retriveEducation(eb.getUname());
		   
		   hs.setAttribute("edbean", edb); 
		   
		   if(edb==null)
		   {
			   req.getRequestDispatcher("addEducation.html").forward(req, resp);
		   }
		   else
		   {
			   req.getRequestDispatcher("education.jsp").forward(req, resp);
		   }
		   
		   
	   }
	}
	
	

}
