<%-- Write a jsp code to show usage of various tag, considering finding the cube of a number
using a function int cube(int) --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cube Number</title>
</head>
<body>
	<%-- Cube Program --%>
 	<%!
 		int n = 5;
        int cube(int n) {
            return n * n * n;
        }
    %>
    
    <% 
    	out.println("JSP Tags<br>");
    %>
    
    <%=
    "Cube of " + n + " = " + cube(n) 
    %>
</body>
</html>