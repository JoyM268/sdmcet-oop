<%-- Write a JSP program that implements a simple calculator. 
The program must provide the features to perform addition, subtraction, multiplication and division
of two numbers based on user’s choice. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("fn"));
		int num2 = Integer.parseInt(request.getParameter("sn"));
		char op = request.getParameter("op").charAt(0);
		
		switch(op){
			case '+':
				out.println("Result: " + (num1 + num2));
				break;
			case '-':
				out.println("Result: " + (num1 - num2));
				break;
			case '*':
				out.println("Result: " + (num1 * num2));
				break;
			case '/':
				if(num2 != 0){
					out.println("Result: " + (num1 / num2));
				}else{
					out.println("Second number cannot be zero for division");
				}
				break;
		}
	%>
</body>
</html>