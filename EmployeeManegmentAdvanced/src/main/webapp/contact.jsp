<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*,java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="loginjsp.css">
<title>Contact</title>
</head>
<body>

 <%
    ContactBean cb=(ContactBean) session.getAttribute("cbean");
    EmployeeBean eb=(EmployeeBean) session.getAttribute("ebean");

 %>
 
   
  <h2 id="greet">Contact Details of <%=eb.getUname() %></h2>
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
                        <div class="lb"><label for="Fname">Personal Email</label></div>
                        <div class="inp"><input type="text" name="" id="fname" value="<%=cb.getPmid() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="lname">Company Email</label></div>
                        <div class="inp"><input type="text" name="" id="lname" value="<%=cb.getCmid() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label for="email">Phone NO</label></div>
                        <div class="inp"><input type="email" name="" id="email" value="<%=cb.getPhno() %>" readonly></div>
                    </div>
                </div>

                <div class="items">
                    <div class="data">
                        <div class="lb"><label style="font-size:14px;" for="phno">Alternativ Phone no</label></div>
                       <div class="inp"><input type="text" name="" id="phno" value="<%=cb.getAphno() %>" readonly></div>
                    </div>
                </div>

               <div class="items">
                    <div class="btn">
                        <button style="padding: 8px 35px;
    border-radius: 10px;
    border: 2px solid   rgb(156, 234, 234);
    box-shadow: 5px 5px 20px rgb(131, 208, 244) ;
    background-color: rgb(156, 234, 234);" ><a style="text-decoration:none; color:black;" href="ContactUpdate.jsp">Update</a></button>
                    </div>
                     
               
               

            </div>
        </section>

    </div>

</body>
</html>