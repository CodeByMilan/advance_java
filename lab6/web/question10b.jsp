<%-- 
    Document   : question10b
    Created on : Sep 15, 2024, 8:15:42 AM
    Author     : Milan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>question 10b</title>
    </head>
    <body>
        <form method="post" action="">
            <label> Username </label>
            <input type="text" name ="username"/>
            <label>Password </label>
            <input type="password" name ="password"/>
            <input type="submit" name ="submit" value="Submit"/>
        </form>
        <%
            final String DEFINED_USERNAME = "milan";
            final String DEFINED_PASSWORD = "milan";
            if (request.getMethod().equalsIgnoreCase("post")) {

                String username = request.getParameter("username");
                String password = request.getParameter("password");

                if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {

                    if (username.equals(DEFINED_USERNAME) && password.equals(DEFINED_PASSWORD)) {
                        out.println("Login successful!!");
                    } else {
                        out.println("Invalid Credentials!!");
                    }
                } else {
                    out.println("Please enter both username and password.");
                }
            }
        %>
    </body>
</html>
