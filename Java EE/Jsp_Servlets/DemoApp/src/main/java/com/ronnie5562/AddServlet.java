package com.ronnie5562;

import java.io.IOException;
//import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	
// We used service() method below -> It works for both post and get request from the form.
// We also have other methods like doGet() and doPost() that only accepts request from a it's methods. e.g => doGet accepts only requests with a `get` method
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int firstNum = Integer.parseInt(req.getParameter("num1"));
		int secondNum = Integer.parseInt(req.getParameter("num2"));
		
		int result = firstNum + secondNum;
		
//		PrintWriter out = res.getWriter();
//		out.println("The result is: " + result);
//
//		System.out.println("The result is: " + result);
		
		// req.setAttribute("result", result);
		
		// Request dispatcher is used to pass data from one servlet to another
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
		// Let's work with sendRedirect Now !!
		
		// res.sendRedirect("square?k=" + result);
		
		// Let's work with session Now !!
		HttpSession session = req.getSession();
		session.setAttribute("result", result);
		res.sendRedirect("square");
	}
}
