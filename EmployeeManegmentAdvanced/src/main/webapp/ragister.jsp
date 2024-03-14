<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ragister</title>
</head>
<body>

<%
  String msg=(String)request.getAttribute("msg");
  
%>

 <h1 style=" width:100%; margin:auto;"><% out.println(msg); %>,<br>Please LogIn<a href="login.html">Log In</a></h1>

</body>
</html>