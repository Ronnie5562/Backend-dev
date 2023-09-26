package com.ronnie5562;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		Cookie email_cookie = new Cookie("email", "");
	}
}
