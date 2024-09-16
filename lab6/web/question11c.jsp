<%-- 
    Document   : question11c
    Created on : Sep 16, 2024, 8:25:27 AM
    Author     : Milan
--%>

<%@page import="java.util.List"%>
<%@page import="question11.question11"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Passing Arraylist from servlet to jsp</title>
    </head>
    <body>
        <h1>Passing Arraylist from servlet to jsp</h1>
        <% 
        List<question11>personlist=(List<question11>)request.getAttribute("data");
        for (int i= 0;i<personlist.size();i++){
        question11 q = personlist.get(i);
        out.println("Name:"+q.getName());
         out.println("Address:"+q.getAddress());
         %>
         <br>
         <%
            }
        %>
    </body>
</html>
