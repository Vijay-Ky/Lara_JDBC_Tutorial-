package com.lara;
import java.sql.*;
class M7 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt = con.createStatement();
		String sql = "SELECT personID, personAGE FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + ",");
			System.out.println(rs.getInt(2));
			System.out.println();
		}
		System.out.println("done");
	}
}
