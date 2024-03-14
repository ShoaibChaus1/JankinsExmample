package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveEducationDAO 
{
	EducationBean edb=null;
	
	public EducationBean retriveEducation(String uName)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("Select * from employee_Education where uname=?");
			ps.setString(1, uName);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				edb=new EducationBean();
				
				edb.setUname(rs.getString(1));
				edb.setHg(rs.getString(2));
				edb.setFos(rs.getString(3));
				edb.setClg(rs.getString(4));
				edb.setMarks(rs.getFloat(5));
				edb.setYear(rs.getLong(6));
				edb.setType(rs.getString(7));
			}
		}catch(Exception e) {e.printStackTrace();}
		return edb;
		
	}

}
