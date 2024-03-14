package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddEducationDAO 
{
	private int k=0;
	
	public int addEducation(EducationBean edb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into employee_education values(?,?,?,?,?,?,?)");
			ps.setString(1, edb.getUname());
			ps.setString(2, edb.getHg());
			ps.setString(3, edb.getFos());
			ps.setString(4, edb.getClg());
			ps.setFloat(5, edb.getMarks());
			ps.setLong(6, edb.getYear());
			ps.setString(7, edb.getType());
			
			k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
