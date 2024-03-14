package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RagisterDAO 
{
	public int k=0;
	
	public int register(EmployeeBean eb)
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?)");
			ps.setString(1, eb.getUname());
			ps.setString(2, eb.getPword());
			ps.setString(3, eb.getFname());
			ps.setString(4, eb.getLname());
			ps.setString(5, eb.getAddr());
			ps.setString(6, eb.getMid());
			ps.setLong(7, eb.phno);
			
			k=ps.executeUpdate();
			
			
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
	}

}
