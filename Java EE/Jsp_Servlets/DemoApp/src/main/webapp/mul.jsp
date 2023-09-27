<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	
	<%
		// We get the request object automatically in jsp
		int firstNum = Integer.parseInt(request.getParameter("jspnum1"));
		int secondNum = Integer.parseInt(request.getParameter("jspnum2"));
		
		int result = firstNum * secondNum;
		
		// We also get the out object automatically.
		
		out.println("Result: " + result);
	%>
</body>
</html>