package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/updateEducation")
public class UpdateEducationServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		
		if(hs==null)
		{
		    req.setAttribute("msg","Session Expired...");
		    req.getRequestDispatcher("Home.jsp").forward(req, resp);
		}
		else
		{
			EmployeeBean eb=(EmployeeBean) hs.getAttribute("ebean");
			
			EducationBean edb=new EducationBean();
			
			edb.setHg(req.getParameter("hg"));
			edb.setFos(req.getParameter("fos"));
			edb.setClg(req.getParameter("clg"));
			edb.setMarks(Float.parseFloat(req.getParameter("marks")));
			edb.setYear(Long.parseLong(req.getParameter("year")));
			edb.setType(req.getParameter("type"));
			
			
			int k=new UpdateEducationDAO().updateEducation(eb.getUname(), edb);
			
			if(k>0)
			{
				resp.sendRedirect("education");
			}
		}
	}
	

}
