<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<%
		String name = request.getParameter("n");
		out.println("Welcome " + name);
		session.setAttribute("user", name);
	%>
	
	<form action="welcome1.jsp">
		<input type="submit" style="margin-top:5px">
	</form>
	
</body>
</html>