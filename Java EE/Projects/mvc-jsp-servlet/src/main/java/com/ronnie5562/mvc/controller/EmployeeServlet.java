package com.ronnie5562.mvc.controller;

//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import com.ronnie5562.mvc.dao.EmployeeDao;
//import com.ronnie5562.mvc.model.Employee;
//import com.ronnie5562.mvc.model.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ronnie5562.mvc.dao.EmployeeDao;
import com.ronnie5562.mvc.model.Employee;
import com.ronnie5562.mvc.model.EmployeeService;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService employeeService;
	
	private EmployeeDao employeeDao;

    public EmployeeServlet() {
        super();
        
        this.employeeService = new EmployeeService();
        this.employeeDao = new EmployeeDao();
    }
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveFormData(request, response);

		request.setAttribute("employess", this.employeeService.getEmployees());

		System.out.println("From servlet: " + request.getAttribute("employess"));

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employees.jsp");
		dispatcher.forward(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request, response);

	}
	
	private void saveFormData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		Employee employee = new Employee();
		
		employee.setId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		
		try {
			int rows_affected = this.employeeDao.registerEmployee(employee);
			System.out.println(rows_affected + " Rows affected");
			
		} catch (ClassNotFoundException err) {
			err.printStackTrace();
			
		}
		
	}
}