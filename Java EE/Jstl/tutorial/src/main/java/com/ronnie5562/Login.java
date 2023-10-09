package com.ronnie5562;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if (uname.equals("ronald") && pass.equals("ronnieboy"))
		{
			
			
			 response.sendRedirect("welcome.jsp");			
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}
}
