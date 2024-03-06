<%@page import="com.rays.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee list</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<style type="text/css">
   form{
      background-color: yellow;
    }
   table{
      background-color: grey;
    }

</style>
</head>
<body>
<%@ include file="header.jsp" %>
<%
List<Employee>elist=(List<Employee>)session.getAttribute("emplist");

%>


<%-- <script>alert("<%=msg%>")</script> --%>

<%-- <jsp:include page="header.jsp"></jsp:include> --%>

<center>
<h1>Employee List</h1>
<% String emp=(String)request.getAttribute("emp");%>
<%if(emp!=null){	 %>
<h4 class="text-success"><%=emp %></h4>
<%} %>

<% String msg=(String)request.getAttribute("msg");%>
<%if(msg!=null){	 %>
<h4 class="text-danger"><%=msg %></h4>
<%} %>
</center>

<table class="table table-striped ">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Email</th>
		<th>Employee Contact</th>
		<th>Employee Designation</th>
		<th>Employee Salary</th>
		<th>Employee Password</th>
		<th >Operations</th>
		<th >Operations</th>
	</tr>
	
	<%for(Employee e:elist){ %>
	<tr>
		<td><%=e.getEmpid()%></td>
		<td><%=e.getEmpname()%></td>
		<td><%=e.getEmpemail()%></td>
		<td><%=e.getEmpcontact()%></td>
		<td><%=e.getEmpdesignation()%></td>
		<td><%=e.getEmpsal()%></td>
		<td><%=e.getEmppass() %></td>
		<td><a class="btn btn-success" href="employeec?action=edit&eid=<%=e.getEmpid()%>">update</a></td>
		<td><a class="btn btn-danger" href="EmployeeList?action=delete&eid=<%=e.getEmpid()%>
		"onclick="return function(){confirm('Are you sure do want to delete this record??'))} ">delete</a></td>
	</tr>
	<%} %>
</table>
<%@ include file="Footer.jsp" %>
</body>
</html>