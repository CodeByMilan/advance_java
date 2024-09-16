import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/question4a")
public class question4a extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Session Handling</title>");
            out.println("</head>");
            out.println("<body>");
            String sessionName = request.getParameter("name");

            if (sessionName != null && !sessionName.isEmpty()) {
                HttpSession session = request.getSession();
                session.setAttribute("username", sessionName);
                out.println("Session set successfully!<br>");
                out.println("Stored session value is: " + session.getAttribute("username") + "<br>");
            } else {
                out.println("No session name provided.<br>");
            }

            out.println("<a href=\"index.html\">Back to Home</a>");
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
        return "Session handling servlet";
    }
}
