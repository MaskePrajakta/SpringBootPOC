<%@page import="com.neosoft.main.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<form action="up">
<%User s=(User)request.getAttribute("data"); %>
Id:<input type="hidden" name="uid" value="<%=s.getId()%>"/><br>
Name:<input type="text" name="name" value="<%=s.getName()%>"/><br>
Surname:<input type="text" name="surname" value="<%=s.getSurname()%>"/><br>
Address:<input type="text" name="addr" value="<%=s.getAddr()%>"/><br>
PinCode:<input type="text" name="pincode" value="<%=s.getPincode()%>"/><br>
Username:<input type="text" name="un"value="<%=s.getUn()%>"/><br>
Password:<input type="password" name="pw" value="<%=s.getPw()%>"/><br>
DOB:<input type="text" name="dob" value="<%=s.getDob()%>"/><br>
JoiningDate:<input type="text" name="joiningDate" value="<%=s.getJoiningDate()%>"/><br>
<input type="submit" value="Submit"/>
</form>
</body>
</html>