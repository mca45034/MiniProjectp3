/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-03-06 08:16:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rays.controller.EmployeeList;
import com.rays.dto.EmployeDTO;
import java.util.Iterator;
import java.util.List;

public final class EmployeeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1709535276414L));
    _jspx_dependants.put("/Footer.jsp", Long.valueOf(1709294379758L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.rays.controller.EmployeeList");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("com.rays.dto.EmployeDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      com.rays.dto.EmployeDTO dto = null;
      dto = (com.rays.dto.EmployeDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new com.rays.dto.EmployeDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <a href=\"welcome.jsp\">Welcome</a> |\r\n");
      out.write("   <a href=\"EmployeCtl\">addEmp</a> |\r\n");
      out.write("   <a href=\"EmployeeList\">EmployeeList</a>\r\n");
      out.write("  <!-- <a href=\"UserRegistrationCtl\"> add User</a> |\r\n");
      out.write("  <a href=\"UserListCtl\">user list</a> | -->\r\n");
      out.write(" <!--  <a href=\"EmployeCtl\">Add Emp</a> |  -->\r\n");
      out.write("  <br>\r\n");
      out.write("  <h3>Hii, Guest</h3>\r\n");
      out.write("  <hr>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<form action=\"EmployeeList\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("		<center>\r\n");
      out.write("\r\n");
      out.write("			<div align=\"center\">\r\n");
      out.write("				<h1>Employee List</h1>\r\n");
      out.write("				");
String msg=(String)request.getAttribute("msg"); 
				if(msg !=null){
				
      out.write("\r\n");
      out.write("				");
      out.print(msg );
      out.write("\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				");
String dto1=(String)request.getAttribute("msg"); 
				if(dto !=null){
				
      out.write("\r\n");
      out.write("				");
      out.print(dto );
      out.write("\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("				 \r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			");

				

				List ulist = (List) request.getAttribute("accu");

				/* int next = DataUtility.getInt(request.getAttribute("nextlist").toString()); */
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");

			 int pageNo=(int)request.getAttribute("pageNo");
			int pageSize=(int)request.getAttribute("pageSize");
				int index = ((pageNo - 1) * pageSize) + 1;

				List list = (List)request.getAttribute("list");
				Iterator<EmployeDTO> it = list.iterator();

				if (list.size() != 0) {
			
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<br>\r\n");
      out.write("\r\n");
      out.write("			<table border=\"1\" width=\"100%\" align=\"center\" cellpadding=6px\r\n");
      out.write("				cellspacing=\".2\">\r\n");
      out.write("				 \r\n");
      out.write("					<th>Delete</th> \r\n");
      out.write("					\r\n");
      out.write("					<th>S.No.</th>\r\n");
      out.write("					\r\n");
      out.write("					<th>EmpName</th>\r\n");
      out.write("					\r\n");
      out.write("					<th>EmpEmail</th>\r\n");
      out.write("					\r\n");
      out.write("					<th>EmpContect</th>\r\n");
      out.write("					\r\n");
      out.write("					<th>EmpDegnation</th>\r\n");
      out.write("					<th>EmpSalry</th>\r\n");
      out.write("					<th>EmpPass</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("				");

					while (it.hasNext()) {
						dto = it.next();
							
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("					 <td><input type=\"checkbox\" class=\"checkbox\" name=\"ids\"\r\n");
      out.write("						value=\"");
      out.print(dto.getEmpId());
      out.write("\"></td> \r\n");
      out.write("						\r\n");
      out.write("					\r\n");
      out.write("					<td>");
      out.print(index++);
      out.write("</td>\r\n");
      out.write("					\r\n");
      out.write("					<td>");
      out.print(dto.getEmpName());
      out.write("</td>\r\n");
      out.write("					\r\n");
      out.write("					<td>");
      out.print(dto.getEmpEmail());
      out.write("</td>\r\n");
      out.write("					\r\n");
      out.write("					<td>");
      out.print(dto.getEmpContect());
      out.write("\r\n");
      out.write("					<td>");
      out.print(dto.getEmpDestignation());
      out.write("\r\n");
      out.write("					<td>");
      out.print(dto.getSalry());
      out.write("\r\n");
      out.write("					<td>");
      out.print(dto.getEmpPass());
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<td> <a href=\"EmployeCtl?id=");
      out.print(dto.getEmpId());
      out.write("\" >edit</td>\r\n");
      out.write("					\r\n");
      out.write("						\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

					}
				
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("			<table >\r\n");
      out.write("			\r\n");
      out.write("				<tr>\r\n");
      out.write("					 <center>\r\n");
      out.write("\r\n");
      out.write("					 <td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(EmployeeList.OP_DELETE);
      out.write("\"></td>\r\n");
      out.write("					\r\n");
      out.write(" 					</center> \r\n");
      out.write("\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("			</table>\r\n");
      out.write("			");

				}
				if (list.size() == 0) {
			
      out.write("\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("	</form>\r\n");
      out.write("	\r\n");
      out.write("	</center>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("#footer {\r\n");
      out.write("    \r\n");
      out.write("    position: fixed;\r\n");
      out.write("    left:0;\r\n");
      out.write("    width:100%; \r\n");
      out.write("    bottom:0;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("    color:black;\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   text-align:center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id =\"footer\">\r\n");
      out.write("<CENTER><hr>\r\n");
      out.write("    <H3>&copy; Copyrights RAYS Technologies</H3>\r\n");
      out.write("</CENTER>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
