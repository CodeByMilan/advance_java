
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
/**
 *
 * @author Milan
 */
public class question1 extends GenericServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset-UTF-8");
        PrintWriter out = res.getWriter();
        out.print("""
                  <html>
                  <head>
                  <title>GenericServlet Example</title>
                  </head>
                  <body>
                  illustrating the concept of GenericServlet class with
                  proper illustration of the Deployment Descriptor.
                  </body>
                  </html>
                  """);
    }

}
