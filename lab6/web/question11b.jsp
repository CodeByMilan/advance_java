<%-- 
    Document   : question11b
    Created on : Sep 16, 2024, 7:51:56 AM
    Author     : Milan
--%>
<%@page import="question11.question11"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>object from servlet to jsp</title>
    </head>
    <body>
        <h2>Example of passing object from servlet to jsp </h2>
            <%
 //whenever we are accessing class object in jsp make sure to put it in a package jsp throws error while accessing it from the default package 
          question11 q = (question11) request.getAttribute("data");
          out.println("Name: " + q.getName());
          out.println("Address: " + q.getAddress());
          %>

    </body>
</html>
