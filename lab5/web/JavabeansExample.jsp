<%-- 
    Document   : JavabeansExample
    Created on : Sep 16, 2024, 8:46:02 AM
    Author     : Milan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Javabeans Example</title>
    </head>
    <body>
         <h1> welcome </h1>
            <jsp:useBean id="Student" class="javabeans.StudentBeans">
                <jsp:setProperty name="Student" property = "name" value="milan"/>
                <jsp:setProperty name="Student" property = "address" value="lalitpur"/>
                <jsp:setProperty name="Student" property = "id" value="101"/>
            </jsp:useBean>
        <p> Student id is :
            <jsp:getProperty name="Student" property="id"/>
        </p>
             <p> Student Name is :
            <jsp:getProperty name="Student" property="name"/>
             </p>
             <p> Student Address is :
            <jsp:getProperty name="Student" property="address"/>
             </p>
    </body>
</html>
