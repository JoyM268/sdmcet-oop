<%-- Write a jsp program that reads the username from html form, on submitting it must print
welcome message to the user and also current date and time --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%
	String name = request.getParameter("n");
	out.println("Welcome " + name);
%>
	
<%=
	new Date()
%>