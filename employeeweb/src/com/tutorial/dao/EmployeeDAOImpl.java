package com.tutorial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.tutorial.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static String oracleDriver="oracle.jdbc.driver.OracleDriver";
	private static String oracleConnectionURL="jdbc:oracle:thin:@localhost:1521/XE";
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	public EmployeeDAOImpl(){
		try {
			Class.forName(oracleDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee getEmployee(String empId) {
		Employee emp=null;
            try {
            	con= DriverManager.getConnection(oracleConnectionURL,"hr","hr");
            	stmt=con.createStatement();
   			    rs=stmt.executeQuery("select * from EMPLOYEES where EMPLOYEE_ID=" + empId);
   			    while(rs.next()){
   			    	emp = new Employee();
   			        emp.setFirstname(rs.getString("First_Name"));
   			        emp.setLastname(rs.getString("Last_Name"));
   			        emp.setEmail(rs.getString("Email"));
                 
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}   


		return emp;
	}

}
