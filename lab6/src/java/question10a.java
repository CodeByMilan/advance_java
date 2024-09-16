import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class question10a extends HttpServlet {

    
    private static final String DEFINED_USERNAME = "milan";
    private static final String DEFINED_PASSWORD = "milan";
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet question10a</title>");
            out.println("</head>");
            out.println("<body>");

            
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
        return "Short description";
    }
}
