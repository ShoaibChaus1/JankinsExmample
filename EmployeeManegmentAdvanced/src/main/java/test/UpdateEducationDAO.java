package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEducationDAO 
{
	private int k=0;
	
	public int updateEducation(String uName,EducationBean edb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update employee_education set hg=?,fos=?,clg=?,marks=?,year=?,type=? where uname=?");
			ps.setString(1,edb.getHg() );
			ps.setString(2, edb.getFos());
			ps.setString(3, edb.getClg());
			ps.setFloat(4, edb.getMarks());
			ps.setLong(5, edb.getYear());
			ps.setString(7, uName);
			
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
