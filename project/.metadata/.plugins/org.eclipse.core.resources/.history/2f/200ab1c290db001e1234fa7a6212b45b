
<%@page import="com.rays.controller.EmployeeList"%>
<%@page import="com.rays.dto.EmployeDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="com.rays.dto.EmployeDTO"
		scope="request"></jsp:useBean>
       <%@include file = "Header.jsp" %>


	<form action="EmployeeList" method="post">

		<center>

			<div align="center">
				<h1>Employee List</h1>
				<%String msg=(String)request.getAttribute("msg"); 
				if(msg !=null){
				%>
				<%=msg %>
				<%} %>
				
				<%String dto1=(String)request.getAttribute("msg"); 
				if(dto !=null){
				%>
				<%=dto %>
				<%} %>
				 

			</div>

			<%
				

				List ulist = (List) request.getAttribute("accu");

				/* int next = DataUtility.getInt(request.getAttribute("nextlist").toString()); */
			%>


			<%
			 int pageNo=(int)request.getAttribute("pageNo");
			int pageSize=(int)request.getAttribute("pageSize");
				int index = ((pageNo - 1) * pageSize) + 1;

				List list = (List)request.getAttribute("list");
				Iterator<EmployeDTO> it = list.iterator();

				if (list.size() != 0) {
			%>
			
			<br>

			<table border="1" width="100%" align="center" cellpadding=6px
				cellspacing=".2">
				 
					<th>Delete</th> 
					
					<th>S.No.</th>
					
					<th>EmpName</th>
					
					<th>EmpEmail</th>
					
					<th>EmpContect</th>
					
					<th>EmpDegnation</th>
					<th>EmpSalry</th>
					<th>EmpPass</th>
				</tr>

				<%
					while (it.hasNext()) {
						dto = it.next();
							
				%>


				<tr align="center">
					 <td><input type="checkbox" class="checkbox" name="ids"
						value="<%=dto.getEmpId()%>"></td> 
						
					
					<td><%=index++%></td>
					
					<td><%=dto.getEmpName()%></td>
					
					<td><%=dto.getEmpEmail()%></td>
					
					<td><%=dto.getEmpContect()%>
					<td><%=dto.getEmpDestignation()%>
					<td><%=dto.getSalry()%>
					<td><%=dto.getEmpPass()%>
					
					
					<td> <a href="EmployeCtl?id=<%=dto.getEmpId()%>" >edit</td>
					
						
				</tr>
				<%
					}
				%>
			</table>

			<table >
			
				<tr>
					 <center>

					 <td><input type="submit" name="operation" value="<%=EmployeeList.OP_DELETE%>"></td>
					
 					</center> 

				</tr>
				
			</table>
			<%
				}
				if (list.size() == 0) {
			%>
			<%-- <td align="center"><input type="submit" name="operation" value="<%=OrderListCtl.OP_BACK%>"></td> --%>
			<%
				}
			%>

			
				
				
	</form>
	
	</center>
	<%@include file="Footer.jsp"%>

</body>
</html>