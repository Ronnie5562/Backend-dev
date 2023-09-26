package com.ronnie5562;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


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
//		int k = Integer.parseInt(req.getParameter("k"));
		
		// This is for session
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("result");
		PrintWriter out2 = res.getWriter();
		out2.println("Result: " + (k * k));
		System.out.println(" Redirect Working");
	}
}