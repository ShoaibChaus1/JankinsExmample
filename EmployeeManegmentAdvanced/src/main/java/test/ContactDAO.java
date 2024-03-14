package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ContactDAO 
{
	 
	ContactBean cb=null;
	
	
	public ContactBean retriveContact(String uName)
	
	{
		
		
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("Select * from Employee_Contact where uname=?");
			
			ps.setString(1, uName);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				
			     cb=new ContactBean();
				cb.setPmid(rs.getString(2));
				cb.setCmid(rs.getString(3));
				cb.setPhno(rs.getLong(4));
				cb.setAphno(rs.getLong(5));	
			}
		}catch(Exception e) {e.printStackTrace();}
		
		
		return cb;
	}

}
