<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password</title>
</head>
<body>

<%
 String msg=(String) request.getAttribute("msg");

%>

<h1 style="text-align:center; margin:auto;"><%=msg %> ,<br> <a href="ragister.html">Ragister Here</a></h1>

</body>
</html>