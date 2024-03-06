<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>

</head>
<body>
<%-- <jsp:include page="/jsp/header.jsp"></jsp:include> --%>
<%@ include file="header.jsp" %>

<form action="employeec" method="post">
<center>
<h1>Add Employee Here</h1>
<%
String msg=(String)request.getAttribute("msg");
if(msg!=null){
	
%>
<h5 style="color:green"><%=msg %></h5>
<%} %>
<input type="hidden" name="action" value="addemp">
	<table>
	<tr>
			<td>Enter Employee id:</td>
			<td><input type="text" name="empid" class="form-control"></td>
		</tr>
		<tr>
			<td>Enter Employee Name:</td>
			<td><input type="text" name="empname" class="form-control"></td>
		</tr>
		<tr>
			<td>Enter Employee Email:</td>
			<td><input type="text" name="empemail" class="form-control"></td>
		</tr>
		<tr>
			<td>Enter Employee Contact:</td>
			<td><input type="text" name="empcontact" class="form-control"></td>
		</tr>
		<tr>
			<td>Enter Employee Designation:</td>
			<td>
				<select name="empdesignation"  class="form-select" >
					<option>Java Developer</option>
					<option>Python Developer</option>
					<option>Manual Tester</option>
					<option>Automation Tester</option>
					<option>Data Analytics</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Enter Employee Salary:</td>
			<td><input type="text" name="empsal" class="form-control"></td>
		</tr>
		<tr>
			<td>Enter Employee Password:</td>
			<td><input type="password" name="emppass" class="form-control"></td>
		</tr>
		<tr>
			<td><button class="btn btn-success">save emp</button></td>
		</tr>
	</table>
</form>

</center>
<%@ include file="Footer.jsp" %>
</body>
</html>