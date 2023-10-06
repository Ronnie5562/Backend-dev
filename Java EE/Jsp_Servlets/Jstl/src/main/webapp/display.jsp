<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Name</title>
</head>
<body>
    <% String name = (String) request.getAttribute("name"); %>
    Name: <%= name %>
</body>
</html>
