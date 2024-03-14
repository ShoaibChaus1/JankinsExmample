package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddContactDAO 
{
	public int k=0;
	
	public int addContact(ContactBean cb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Employee_Contact values(?,?,?,?,?)");
			ps.setString(1, cb.getUname());
			ps.setString(2, cb.getPmid());
			ps.setString(3, cb.getCmid());
			ps.setLong(4, cb.getPhno());
			ps.setLong(5, cb.getAphno());
			
			k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
