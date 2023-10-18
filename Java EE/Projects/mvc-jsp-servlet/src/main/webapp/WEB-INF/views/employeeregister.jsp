<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	body {
	  margin: 20px;
	}
	
	.employee-form {
	  text-align: center;
	  padding: 20px;
	  border: 1px solid #ccc;
	  border-radius: 10px;
	  max-width: 80%;
	  margin: 0 auto;
	}
	
	.employee-form h1 {
	  font-size: 24px;
	  margin-bottom: 20px;
	}
	
	.employee-form table {
	  width: 80%;
	  margin: 0 auto;
	}
	
	.employee-form table td {
	  padding: 10px;
	}
	
	.employee-form table input {
	  width: 100%;
	  padding: 8px;
	  box-sizing: border-box;
	  border: 1px solid #ccc;
	  border-radius: 5px;
	  margin-bottom: 10px;
	}
	
	.employee-form input[type="submit"] {
	  padding: 10px 20px;
	  background-color: #007BFF;
	  color: white;
	  border: none;
	  border-radius: 5px;
	  cursor: pointer;
	  font-size: 16px;
	}
	
	.employee-form input[type="submit"]:hover {
	  background-color: #0056b3;
	}
	
	.provided-text {
	  max-width: 80%;
	  margin: 0 auto;
	  text-align: justify;
	}
	
	.provided-text p {
	  margin-bottom: 20px;
	  line-height: 1.5;
	}

</style>
</head>
<body>
 <div class="employee-form">
        <h1>Employee Register Form</h1>
        <form action="<%= request.getContextPath() %>/register" method="post">
            <table>
                <tr>
                    <td>Employee id</td>
                    <td><input type="text" name="id" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName" /></td>
                </tr>
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" /></td>
                </tr>
                <tr>
                    <td>Contact No</td>
                    <td><input type="text" name="contact" /></td>
                </tr>
            </table>
            <input type="submit" value="Submit" />
        </form>
    </div>
</body>
</html>