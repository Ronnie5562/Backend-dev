<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ronnie5562.mvc.model.Employee"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees Data</title>
<style>
    /* Optional: Add some basic styling */
    table {
      width: 100%;
      border-collapse: collapse;
    }
    th, td {
      border: 1px solid black;
      padding: 8px;
      text-align: left;
    }
  </style>
</head>
<body>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employess");
	%>
	
	<h1>Employes Data</h1>
	<table>
		<thead>
			<tr>
			    <th>Employee Id</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
		</thead>
		<tbody>
			<% for (Employee employee : employees) { %>
				<tr>
					<td><%=employee.getId() %></td>
					<td><%=employee.getFirstName() %></td>
					<td><%=employee.getLastName() %></td>
				</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>