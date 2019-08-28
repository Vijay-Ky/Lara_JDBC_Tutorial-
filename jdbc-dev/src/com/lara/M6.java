package com.lara;
import java.sql.*;
class M6 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next())
		{
			System.out.println(rs.getInt(1) + ",");/*Instead of specifying the column name we can supply column number we get the same result*/
			System.out.println(rs.getString(2) + ",");
			System.out.println(rs.getInt(3) + ",");
			System.out.println();
		}
		System.out.println("done");
	}
}
