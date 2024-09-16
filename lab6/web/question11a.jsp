<%-- 
    Document   : question11a
    Created on : Sep 15, 2024, 8:43:17 AM
    Author     : Milan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>question 11</title>
    </head>
    <body>
        
       <% 
       out.print("message from servlet to jsp:");
       out.print(request.getAttribute("message"));
       %>
    </body>
</html>
