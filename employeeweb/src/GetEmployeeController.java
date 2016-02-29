

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tutorial.dao.EmployeeDAO;
import com.tutorial.dao.EmployeeDAOImpl;
import com.tutorial.domain.Employee;
import com.tutorial.service.EmployeeService;
import com.tutorial.service.EmployeeServiceImpl;

import sun.print.PrinterJobWrapper;

import java.sql.*;
@WebServlet("/GetEmployeeController")

public class GetEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    
	public GetEmployeeController() {
        super();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empId=request.getParameter("empId");
        
        	
        String withbonus=request.getParameter("withBonous");
         
        EmployeeService emplService=new EmployeeServiceImpl();
        Employee employee= emplService.getEmployee(empId, true);
       
//        EmployeeDAO employeeDao = new EmployeeDAOImpl();
//        Employee employee= employeeDao.getEmployee(empId);
        
        java.util.List<Employee> employees= emplService.getEmployeeUsingDeptId("");
    
        request.setAttribute("employee", employee);
        
        
        
//        String queryString = "?fn="+employee.getFirstname()+"&ln="+employee.getLastname()+"&email="+employee.getEmail();
        /*RequestDispatcher rd=request.getRequestDispatcher("EmployeeViewServlet"+queryString);
        rd.forward(request, response);
*/
        
//        RequestDispatcher body=request.getRequestDispatcher("EmployeeViewServlet");
        RequestDispatcher body=request.getRequestDispatcher("EmployeeViewJSP.jsp");
        body.forward(request, response);
        
//        response.sendRedirect("EmployeeViewServlet?fn="+employee.getFirstname());

	}

	}


