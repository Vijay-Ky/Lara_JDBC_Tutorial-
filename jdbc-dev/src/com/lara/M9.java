package com.lara;
import java.sql.*;
class M9 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt = con.createStatement();
		String sql = "SELECT PERSONNAME P_NAME, PERSONAGE P_AGE FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();// 1. meta data is nothing but information about the column information like total no. of columns, column name, column datatype etc. 2. ResultSetMetaData will be extracting the MeataData of ResultSet into rsmd
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));

		while(rs.next())
		{
			System.out.print(rs.getString("P_NAME") + ",");
			System.out.println(rs.getString("P_AGE"));
		}
		System.out.println("done");
	}
}
