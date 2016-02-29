<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.tutorial.domain.Employee"
     %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Employee emp=(Employee)request.getAttribute("employee");
%>
<body>


Hello you are in the view JSP......
EmployeeFN :<%=emp.getFirstname() %><br>
EmployeeLN :<%=emp.getLastname() %><br>
EmployeeEmail :<%=emp.getEmail() %><br>


</body>
</html>