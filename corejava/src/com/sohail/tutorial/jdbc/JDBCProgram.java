package com.sohail.tutorial.jdbc;

import java.sql.*;

public class JDBCProgram {

	private static String empQuery = "select * from EMPLOYEES where EMPLOYEE_ID=100";
	private static String oracleDriver="oracle.jdbc.driver.OracleDriver";
	private static String oracleConnectionURL="jdbc:oracle:thin:@localhost:1521/xe";
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	 
	public static void main(String[] args) {
		
		try {
			Class.forName(oracleDriver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			 con = DriverManager.getConnection(oracleConnectionURL,"hr","hr");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			rs=stmt.executeQuery(empQuery);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
            try {
				while(rs.next()){
					try {
						System.out.println(rs.getString(2));
					} catch (SQLException e) {
			
						e.printStackTrace();
					}
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}   
	}

}
