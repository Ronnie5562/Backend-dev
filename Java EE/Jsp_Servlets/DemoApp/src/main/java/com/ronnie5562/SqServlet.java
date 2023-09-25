package com.ronnie5562;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int result = (int)req.getAttribute("result");
		result *= result;
		PrintWriter out = res.getWriter();
		
		out.println("From Sq Servlet");
		out.println("Result: " + result);
	}
}