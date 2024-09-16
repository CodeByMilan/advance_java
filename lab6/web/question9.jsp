<%-- 
    Document   : question9
    Created on : Sep 15, 2024, 7:53:44 AM
    Author     : Milan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>question 9</title>
    </head>
    <body>
        <h2>User Information Form</h2>
        <form action="" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required><br><br>

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required><br><br>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required><br><br>

            <label>Gender:</label>
            <input type="radio" id="male" name="gender" value="Male" required>
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="Female">
            <label for="female">Female</label><br><br>

            <label for="qualification">Maximum Qualification:</label>
            <select id="qualification" name="qualification">
                <option value="">Select a Qualification Level</option>
                <option value="SLC">SLC</option>
                <option value="+2">+2</option>
                <option value="Bachelor">Bachelor</option>
                <option value="Masters">Masters</option>
            </select><br><br>

            <input type="submit" value="Submit">
        </form>

        <%
                if (request.getMethod().equalsIgnoreCase("post")) {
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                String email = request.getParameter("email");
                String gender = request.getParameter("gender");
                String qualification = request.getParameter("qualification");
        %>
        <h3>Submitted User Information</h3>
        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>Name</th>
                <td><%= name%></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><%= address%></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><%= email%></td>
            </tr>
            <tr>
                <th>Gender</th>
                <td><%= gender%></td>
            </tr>
            <tr>
                <th>Qualification</th>
                <td><%= qualification != null && !qualification.isEmpty() ? qualification : "Not specified"%></td>
            </tr>
        </table>
        <%
            }
        %>
    </body>
</html>
