package com.lara;
import java.sql.*;
import java.util.Scanner;
class M10 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		String tableName = sc.next();
		String sql = "SELECT * FROM PERSON" + tableName;
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();

		while(rs.next())
		{
			for(int i = 1; i <= cols; i++)
			{
				System.out.println(rs.getString(i) + ",");
			}
			System.out.println();
		}
		System.out.println("done");
	}
}
