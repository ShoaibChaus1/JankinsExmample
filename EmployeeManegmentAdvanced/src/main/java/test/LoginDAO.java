package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	public EmployeeBean eb=null;
	
	public EmployeeBean login(String uName,String pWord)
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from employee where uname=? and pword=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				eb=new EmployeeBean();
				eb.setUname(rs.getString(1));
				eb.setPword(rs.getString(2));
				eb.setFname(rs.getString(3));
				eb.setLname(rs.getString(4));
				eb.setAddr(rs.getString(5));
				eb.setMid(rs.getString(6));
				eb.setPhno(rs.getLong(7));
			}
		}catch(Exception e) {e.printStackTrace();}
		return eb;
	}

}
