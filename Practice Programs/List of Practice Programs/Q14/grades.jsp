<%-- 
Write  a  JSP  program  that  reads  marks  scored  by  a  student  in  a  course  (out  of  100)  and 
displays the grade obtained. 
Use the following table to compute the grades:
+--------------+------------+-----------+-----------+-----------+-----------+-----------+-----------+----------+
|     Marks    | (90 - 100) | (80 - 89) | (70 - 79) | (60 - 69) | (50 - 59) | (45 - 49) | (40 - 44) | (39 - 0) |
| (out of 100) |            |           |           |           |           |           |           |          |
+--------------+------------+-----------+-----------+-----------+-----------+-----------+-----------+----------+
|    Grade     |     O      |     A+    |     A     |     B+    |     B     |     C     |     P     |     F    |
+--------------+------------+-----------+-----------+-----------+-----------+-----------+-----------+----------+
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grades</title>
</head>
<body>
	<%
		int marks = Integer.parseInt((request.getParameter("marks")));
		if(marks < 0 || marks > 100){
			out.println("The marks should be between 0 to 100");
		}else if(marks >= 90){
			out.println("Grade obtained by student is: O");
		}else if(marks >= 80){
			out.println("Grade obtained by student is: A+");
		}else if(marks >= 70){
			out.println("Grade obtained by student is: A");
		}else if(marks >= 60){
			out.println("Grade obtained by student is: B+");
		}else if(marks >= 50){
			out.println("Grade obtained by student is: B");
		}else if(marks >= 45){
			out.println("Grade obtained by student is: C");
		}else if(marks >= 40){
			out.println("Grade obtained by student is: P");
		}else{
			out.println("Grade obtained by student is: F");
		}
	%>
</body>
</html>