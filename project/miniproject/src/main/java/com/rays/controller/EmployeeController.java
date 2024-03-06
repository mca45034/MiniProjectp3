package com.rays.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rays.Interface.EmployeeDao;
import com.rays.bean.Employee;
import com.rays.model.EmployeeDaoImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employeec")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
	boolean result;
	private int empid;
	private String empname;
	private String empemail;
	private String empcontact;
	private String empdesignation;
	private double empsal;
	private String emppass;
	String action;
	Employee emp;
	EmployeeDao edao = new EmployeeDaoImpl();
	RequestDispatcher rd;

	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		out = response.getWriter();
		
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		
		action = request.getParameter("action");


		
		
		if (action != null && action.equalsIgnoreCase("edit")) {
			empid = Integer.parseInt(request.getParameter("eid"));
			emp = edao.showEmployeeById(empid);
			if (emp != null) {
				session.setAttribute("employee", emp);
				rd = request.getRequestDispatcher("updateEmployee.jsp");
				rd.forward(request, response);
			}
		} // edit operation closed


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("dopost runing....");
		
		out = response.getWriter();
		
		response.setContentType("text/html");
		
		action = request.getParameter("action");// addemp or updatemp
		HttpSession session = request.getSession();
		if (action != null && action.equalsIgnoreCase("addemp")) {

			System.out.println("dopost me addd method chali.....");

			empid = Integer.parseInt(request.getParameter("empid"));
			System.out.println("add ke ander aya...");
			empname = request.getParameter("empname");
			empemail = request.getParameter("empemail");
			empcontact = request.getParameter("empcontact");
			empdesignation = request.getParameter("empdesignation");
			empsal = Double.parseDouble(request.getParameter("empsal"));
			emppass = request.getParameter("emppass");
			emp = new Employee(empname, empemail, empcontact, empdesignation, empsal, emppass, empid);
			result = edao.addEmployee(emp); // true or false

			if (result) {
				System.out.println("employee added successfully");
				request.setAttribute("msg", "employee added successfully");
				rd = request.getRequestDispatcher("addEmployee.jsp");

				rd.forward(request, response);
			} else {
				System.out.println("employee not added ");
				request.setAttribute("msg", "employee not added");
				rd = request.getRequestDispatcher("addEmployee.jsp");
				rd.forward(request, response);
			}
		} // add closed

		if (action != null && action.equalsIgnoreCase("updateemp")) {

			System.out.println("dopost me addd method chali.....");
			
			empid = Integer.parseInt(request.getParameter("empid"));
			
			empname = request.getParameter("empname");
			
			empemail = request.getParameter("empemail");
			
			empcontact = request.getParameter("empcontact");
		
			
			empdesignation = request.getParameter("empdesignation");
			
			empsal = Double.parseDouble(request.getParameter("empsal"));
			
			emppass = request.getParameter("emppass");
			
			emp = new Employee(empname, empemail, empcontact, empdesignation, empsal, emppass, empid);
			
			result = edao.updateEmployee(emp);
			
			if (result) {
				
				System.out.println("employee updated successfully");
				
				request.setAttribute("emp", "employee updated successfully");
				
				List<Employee> elist = edao.showEmpList();
				System.out.println("using are list...");
				session.setAttribute("emplist", elist);
				rd = request.getRequestDispatcher("updateEmployee.jsp");
				rd.forward(request, response);

			} else {
				System.out.println("employee not updated successfully");
				
				request.setAttribute("msg", "employee not updated successfully");
				
				rd = request.getRequestDispatcher("updateEmployee.jsp");
				rd.forward(request, response);
			}
		}

	}

}
