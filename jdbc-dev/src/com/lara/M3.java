package com.lara;
import java.sql.*;
class M3 
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
		String sql = "create table person(personID number, personName varchar(40), personAGE number)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
