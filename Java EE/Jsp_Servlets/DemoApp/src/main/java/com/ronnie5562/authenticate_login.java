package com.ronnie5562;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class authenticate_login extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		Cookie[] MyCookies = req.getCookies();
		String email = "";
		String pass = "";
		
		for (Cookie cookie : MyCookies)
		{
			if (cookie.getName().equals("email"))
				email = (String)cookie.getValue();

			if (cookie.getName().equals("pass"))
				pass = (String)cookie.getValue();
		}
		
		ServletContext ctx = getServletContext();
		
		String serverEmail = ctx.getInitParameter("serverEmail");
		String serverPassword = ctx.getInitParameter("serverPassword");
		
		PrintWriter out = res.getWriter();		
		
		if (email.equals(serverEmail) && pass.equals(serverPassword)) {
		    out.println("ACCESS GRANTED");
		    System.out.println("ACCESS GRANTED");
		} 
		else if (email.equals(serverEmail)) {
		    out.println("ACCESS DENIED\nWRONG PASSWORD");
		    System.out.println("ACCESS DENIED\nWRONG PASSWORD");
		}
		else {
		    out.println("ACCESS DENIED\nWRONG EMAIL");
		    System.out.println("ACCESS DENIED\nWRONG EMAIL");
		}
	}
}