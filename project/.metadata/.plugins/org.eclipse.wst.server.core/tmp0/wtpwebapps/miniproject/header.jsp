<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<style type="text/css">
body{
      background-color: orange;
    }
     form{
      background-color: aqua;
    }
</style>
</head>
<body>
<form action="">
	<center>
<h2 class="text-dark">Employee Mini Project</h2>
</center>
	<%
	String user = (String) session.getAttribute("usertype");

		if (user != null) {
	%>
	<h3>
		Hii,
		<%=user%></h3>
	<%
		}
	%>

	<%
		if (user != null && user.equalsIgnoreCase("admin")) {
	%>
	<a href="addEmployee.jsp" class="btn btn-info">Add Employee</a>
	<a href="EmployeeList" class="btn btn-info">show Employee list</a>
	
	<%
		}

		else if (user != null || user != "admin") {
	%>
	<a href="EmployeeList?action=editbyemail&email=<%=user%>"
		class="btn btn-info">Check Profile</a>
	<%
		}
	%>
	<a href="loginc" class="btn btn-info">logout</a>
	<h1><hr></h1>
	</form>
</body>
</html>