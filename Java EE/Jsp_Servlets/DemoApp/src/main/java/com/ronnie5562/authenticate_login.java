package com.ronnie5562;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class authenticate_login extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		Cookie[] MyCookies = req.getCookies();
		String email = "";
		String pass = "";
		
		for (Cookie cookie : MyCookies)
		{
			if (cookie.getName().equals("email"))
				email = cookie.getValue();
			if (cookie.getName().equals("pass"))
				pass = cookie.getValue();
		}
		
		String serverEmail = "r.abimbola@alustudent.com";
		String serverPassword = "admin";
		
		
		
		if ((email == serverEmail) && (pass == serverPassword))
			System.out.println();
		
	}
}