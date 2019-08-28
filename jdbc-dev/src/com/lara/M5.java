package com.lara;
import java.sql.*;
class M5 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt = con.createStatement();
		String sql = "select * from person";
		ResultSet rs = stmt.executeQuery(sql);/*we should use executeQuery while sending select command*/
        /* There is a cursor concept in ResultSet that cursor will be initially before first row*/     
		while(rs.next())/* 1. while calling rs.next() cursor will come to the first row, if first row available then it returns true 2. As long as row is available then while loop returns true. 3.while loop is more convienient while iterating throgh method return statement, no variable is maintaining and it just return a boolean value.*/
		{
			System.out.println(rs.getInt("personID") + ",");
			System.out.println(rs.getString("personNAME") + ",");
			System.out.println(rs.getInt("personAGE") + ",");
			System.out.println();
		}
		System.out.println("done");
	}
}
