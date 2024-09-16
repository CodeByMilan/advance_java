import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/question4b")
public class cookieexample extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cookie Handling</title>");
            out.println("</head>");
            out.println("<body>");

          
            String cookieValue = request.getParameter("cname");

            if (cookieValue != null && !cookieValue.isEmpty()) {
                Cookie cookie = new Cookie("mycookie", cookieValue);
                response.addCookie(cookie);
                out.println("Cookie set successfully!<br>");
            } else {
                out.println("No cookie value provided.<br>");
            }

            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                out.println("<h3>Cookies:</h3>");
                for (Cookie c : cookies) {
                    out.println("Cookie Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
                }
            } else {
                out.println("No cookies found.<br>");
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
        return "Cookie handling servlet";
    }
}
