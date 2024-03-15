<!-- result.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Prototype Pattern Example</title>
</head>
<body>
    <h2>Prototype Pattern Example</h2>
    <h3>Original Object:</h3>
    <p>Name: <%= ((ConcretePrototype)request.getAttribute("original")).getName() %></p>
    <h3>Cloned Object:</h3>
    <p>Name: <%= ((ConcretePrototype)request.getAttribute("cloned")).getName() %></p>
</body>
</html>
