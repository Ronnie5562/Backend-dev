package com.ronnie5562;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if (uname.equals("ronald") && pass.equals("1234"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");			
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}
}
