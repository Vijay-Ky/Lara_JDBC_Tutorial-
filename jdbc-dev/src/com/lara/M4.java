package com.lara;
import java.sql.*;
class M4
{
	public static void main(String[] args) throws Exception
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "system";
		String password = "admin";

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement stmt = con.createStatement();
		String sql1 = "insert into person values(101, 'vijay', 26)";
		String sql2 = "insert into person values(102, 'david', 27)";
		String sql3 = "insert into person values(103, 'james', 28)";
		String sql4 = "insert into person values(104, 'chris', 29)";
		String sql5 = "insert into person values(105, 'adam', 30)";

		stmt.execute(sql1);
		stmt.execute(sql2);
		stmt.execute(sql3);
		stmt.execute(sql4);
		stmt.execute(sql5);
		System.out.println("done");
	}
}
