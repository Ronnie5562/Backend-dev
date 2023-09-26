package com.ronnie5562;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		Cookie email_cookie = new Cookie("email", email);
		res.addCookie(email_cookie);
		
		Cookie pass_cookie = new Cookie("pass", pass);
		res.addCookie(pass_cookie);
		
		res.sendRedirect("authenticate");
	}
}
