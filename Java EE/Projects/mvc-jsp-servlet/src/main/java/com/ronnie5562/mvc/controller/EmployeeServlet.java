package com.ronnie5562.mvc.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ronnie5562.mvc.model.EmployeeService;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService employeeService;

    public EmployeeServlet() {
        super();
        
        this.employeeService = new EmployeeService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		processResquest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processResquest(request, response);
	}
	
	private void processResquest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("employess", this.employeeService.getEmployees());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employees.jsp");
		dispatcher.forward(request, response);
		
		
	}
}