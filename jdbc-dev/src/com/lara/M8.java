package com.lara;
import java.sql.*;
class M8 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt = con.createStatement();
		String sql = "select personName p_name, personAge p_age from person";/* creating alias name for personName and personAge column */
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next())
		{
			/* printing column values by using the alias name*/
			System.out.print(rs.getString("p_name") + ",");
			/* printing column values by using the alias name*/
			System.out.println(rs.getInt("p_age"));
		}
		System.out.println("done");
	}
}
