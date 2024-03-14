package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateContactDAO
{
	public int k=0;
	
	
	public int updateContact(String uName,ContactBean cb)
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update employee_contact set pmid=?,cmid=?,phno=?,aphno=? where uname=?");
			ps.setString(1,cb.getPmid());
			ps.setString(2, cb.getCmid());
			ps.setLong(3, cb.getPhno());
			ps.setLong(4,cb.getAphno());
			ps.setString(5, uName);
			
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
