package com.tutorial.sohail.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     String message="";
     PrintWriter out = response.getWriter();
     Cookie cookies[]= request.getCookies();
     if(cookies !=null){
    	 for(Cookie cook : cookies){
    		 if(cook.getName().equals("mykey")&&("7852").equals(cook.getName()));
    		 message=("I am an existing client...");
    		 
    	 }
     }
     else{
    	 Cookie cookie= new Cookie("mykey","7852"); 
         response.addCookie(cookie);	 
         message=("I am a new customer...");
     }
     
     out.print("<html><body>"); 
		out.println(message);
	    out.println("Please return to Home Page <a href=\"" + "http://localhost:8081/ew/cookie.html"+ "\">Home Page</a>.");
		out.print("</body></html>");
		doGet(request, response);
	}

}
