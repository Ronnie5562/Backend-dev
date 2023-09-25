package com.ronnie5562;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		int firstNum = Integer.parseInt(req.getParameter("num1"));
		int secondNum = Integer.parseInt(req.getParameter("num2"));
		
		int result = firstNum + secondNum;
		
		System.out.println("The result is: " + result);
	}
}
 