package com.ronnie5562;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//      This is for RequestDispatcher
		
//		int result = (int)req.getAttribute("result");
//		result *= result;
//		PrintWriter out = res.getWriter();
//		
//		out.println("From Sq Servlet");
//		out.println("Result: " + result);
		
		// This is for sendRedirect - Url redirecting - url rewriting
		int k = Integer.parseInt(req.getParameter("k"));
		PrintWriter out2 = res.getWriter();
		out2.println("Result: " + (k * k));
		System.out.println(" Redirect Working");
	}
}