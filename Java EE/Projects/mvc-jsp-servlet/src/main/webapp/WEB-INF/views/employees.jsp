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

    table {
      width: 85%;
      max-width: 900px;
      border-collapse: collapse;
      margin: 20px auto;
      font-family: Arial, sans-serif;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }

    th, td {
      border: 1px solid #ddd;
      padding: 12px;
      text-align: left;
    }

    th {
      background-color: #f2f2f2;
    }

    tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    tr:hover {
      background-color: #f1f1f1;
    }
    
  </style>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	System.out.println("Data from table page: " + employees);
	%>
	
	<h1>Employees Data</h1>
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