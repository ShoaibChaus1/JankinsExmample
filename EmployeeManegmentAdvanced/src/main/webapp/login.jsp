<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"
    %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Home.css">
    <link rel="stylesheet" href="loginjsp.css">
    <title>Home</title>
</head>

<body>
 
 <%
   EmployeeBean eb=(EmployeeBean) session.getAttribute("ebean");
 %>

    <h2 id="greet">Welcome <%=eb.getFname() %></h2>

    <div id="hr"></div>
    <div class="container">
        <section id="left">
            <div class="options">
                <ul>
                    <li><a href="login.jsp">Genral</a></li>
                    <li><a href="contact">Contact</a></li>
                    <li><a href="education">Education</a></li>
                    <li><a href="">Experiance</a></li>
                    <li><a href="">Bank Details</a></li>
                </ul>

            </div>

        </section>

        <section id="right">
            <div class="details">

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="Fname">First Name</label></div>
                        <div class="inp"><input type="text" name="" id="fname" value="<%=eb.getFname() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="lname">Last Name</label></div>
                        <div class="inp"><input type="text" name="" id="lname" value="<%=eb.getLname() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="email">Email Id</label></div>
                        <div class="inp"><input type="email" name="" id="email" value="<%=eb.getMid() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="phno">Address</label></div>
                       <div class="inp"><input type="text" name="" id="phno" value="<%=eb.getAddr() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="phno">Phone Number</label></div>
                       <div class="inp"><input type="text" name="" id="phno" value="<%=eb.getPhno() %>" readonly></div>
                    </div>
                </div>

               

            </div>
        </section>

    </div>

</body>

</html>