import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/question3"})
public class question3 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");
            String qualification = request.getParameter("qualification");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Question3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Form Data Submitted</h2>");
            out.println("<p>Name: " + name + "</p>");
            out.println("<p>Address: " + address + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Gender: " + gender + "</p>");
            out.println("<p>Qualification: " + qualification + "</p>");
            
            try {
                //question no 5 
                Class.forName("com.mysql.jdbc.Driver"); // Updated driver class
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/user_info", "root", "")) {
                   
                    String createTableQuery = "CREATE TABLE IF NOT EXISTS user_details ("
                            + "id INT AUTO_INCREMENT PRIMARY KEY, "
                            + "name VARCHAR(250), "
                            + "address VARCHAR(250), "
                            + "email VARCHAR(250), "
                            + "gender VARCHAR(10), "
                            + "qualification VARCHAR(250))";
                    try (PreparedStatement pst = conn.prepareStatement(createTableQuery)) {
                        pst.executeUpdate();
                    }
                    //question no 6 
                    // Insert data into the table
                    String insertQuery = "INSERT INTO user_details (name, address, email, gender, qualification) "
                            + "VALUES (?, ?, ?, ?, ?)";
                    try (PreparedStatement pst1 = conn.prepareStatement(insertQuery)) {
                        pst1.setString(1, name);
                        pst1.setString(2, address);
                        pst1.setString(3, email);
                        pst1.setString(4, gender);
                        pst1.setString(5, qualification);
                        pst1.executeUpdate();
                    }
                    
                    // Display data in a tabular format
                    String selectQuery = "SELECT * FROM user_details";
                    try (PreparedStatement pst2 = conn.prepareStatement(selectQuery);
                         ResultSet rs = pst2.executeQuery()) {
                        out.println("<h2>Data from Database</h2>");
                        out.println("<table border='1'>");
                        out.println("<tr><th>ID</th><th>Name</th><th>Address</th><th>Email</th><th>Gender</th><th>Qualification</th></tr>");
                        while (rs.next()) {
                            out.println("<tr>");
                            out.println("<td>" + rs.getInt("id") + "</td>");
                            out.println("<td>" + rs.getString("name") + "</td>");
                            out.println("<td>" + rs.getString("address") + "</td>");
                            out.println("<td>" + rs.getString("email") + "</td>");
                            out.println("<td>" + rs.getString("gender") + "</td>");
                            out.println("<td>" + rs.getString("qualification") + "</td>");
                            out.println("</tr>");
                        }
                        out.println("</table>");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet for handling form submission and database interaction";
    }
}
