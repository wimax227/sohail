

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.PrinterJobWrapper;

import java.sql.*;
@WebServlet("/GetEmployeeServlet")
public class GetEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String oracleDriver="oracle.jdbc.driver.OracleDriver";
	private static String oracleConnectionURL="jdbc:oracle:thin:@localhost:1521/XE";
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;

       
    public GetEmployeeServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empId=request.getParameter("empId");
        String empQuery = "select * from EMPLOYEES where EMPLOYEE_ID=" + empId;
		String EmployeeFN=null;
		String EmployeeLN=null;
		String EmployeeEmail=null;


		try {
			Class.forName(oracleDriver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
            try {
            	con= DriverManager.getConnection(oracleConnectionURL,"hr","hr");
            	stmt=con.createStatement();
   			    rs=stmt.executeQuery(empQuery);
   			    while(rs.next()){
	 EmployeeFN=rs.getString("First_Name");
    EmployeeLN=rs.getString("Last_Name");
    EmployeeEmail=rs.getString("Email");
    

    
    /*try {
						System.out.println(rs.getString(2));
					} catch (SQLException e) {
			
						e.printStackTrace();
					}*/
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}   
PrintWriter out= response.getWriter();
out.print("<html><body>");    
out.println("EmployeeFN :"+ EmployeeFN + "<br>");
out.println("EmployeeLN :"+ EmployeeLN + "<br>");
out.println("EmployeeEmail :"+ EmployeeEmail + "<br>");
out.print("</body></html>");
	}

	}


