package com.lara;
import java.sql.*;
class M1 
{
	public static void main(String[] args) throws Exception 
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "admin";

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		String sql = 
        "CREATE TABLE EMPLOYEES(SNO NUMBER, LAST_NAME VARCHAR2(40), FIRST_NAME VARCHAR2(40), EMAIL VARCHAR2(40))";
		stmt.execute(sql);
		System.out.println("done");
	}
}
