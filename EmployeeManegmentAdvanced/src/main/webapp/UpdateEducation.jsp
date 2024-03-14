<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="addEducation.css">
<title>Education</title>
</head>
<body>

  <%
     EducationBean edb=(EducationBean) session.getAttribute("edbean");
     EmployeeBean eb=(EmployeeBean) session.getAttribute("ebean");
  %>

     <h2 id="greet">Education Details of <%=eb.getUname() %> </h2>

    <div id="hr"></div>
    <div class="container">
        <section id="left">
            <div class="options">
                <ul>
                    <li><a href="login.jsp">Genral</a></li>
                    <li><a href="contact">Contact</a></li>
                    <li><a href="education">Education</a></li>
                    <li><a href="">Experiance</a></li>
                </ul>

            </div>

        </section>

        <section id="right">
            <div class="details">
                <form action="updateEducation" method="post">

                    <div class="items">
                        <div class="data">
                            <div class="lb"><label for="cmid" style="font-size: 14px;">Higher Study</label></div>
                            <div class="inp"><input type="text" name="hg" id="cmid" value="<%=edb.getHg() %>"  >                           </div>
                        </div>
                    </div>

                    <div class="items">
                        <div class="data">
                            <div class="lb"><label for="pmid" style="font-size: 14px;">Field Of Study</label></div>
                            <div class="inp"><input type="text" name="fos" id="pmid" value="<%=edb.getFos() %>"  >
                            </div>
                        </div>
                    </div>


                    <div class="items">
                        <div class="data">
                            <div class="lb"><label for="phno" style="font-size: 14px;">Collage or School</label></div>
                            <div class="inp"><input type="text" name="clg" id="phno"
                                    value="<%=edb.getClg() %>" readonly></div>
                        </div>
                    </div>

                    <div class="items">
                        <div class="data">
                            <div class="lb"><label for="aphno" style="font-size: 14px;">Marks </label></div>
                            <div class="inp"><input type="text" name="marks" id="aphno" value="<%=edb.getMarks() %>" 
 >                     </div>
                        </div>
                    </div>

                    <div class="items">
                        <div class="data">
                            <div class="lb"><label for="aphno" style="font-size: 14px;">Completed By</label></div>
                            <div class="inp"><input type="text" name="year" id="aphno"
                                    value="<%=edb.getYear() %>" ></div>
                        </div>
                    </div>

                    <div class="items">
                        <div class="data">
                            <div class="lb"><label for="aphno" style="font-size: 14px;">Course Type</label></div>
                            <div class="inp"><input type="text" name="type" value="<%=edb.getType() %>">nbsp;
                            <input type="radio" name="type" value="Part Time">Part Time
                                        <input type="radio" name="type" value="Full Time">Full Time
                                        <input type="radio" name="type" value="Others" >Others
                                
                            </div>
                        </div>
                    </div>

                    <div class="items">
                        <div class="btn">
                            <input type="submit" value="Update">
                        </div>
                    </div>

                </form>

            </div>
        </section>

    </div>

</body>
</html>