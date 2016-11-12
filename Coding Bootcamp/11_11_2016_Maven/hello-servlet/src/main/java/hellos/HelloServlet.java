package hellos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class HelloServlet extends HttpServlet {
  String nameparam = "";
  /**
  * Handles GET requests.
  *
  * @param request the HTTP request.
  * @param response the HTTP response.
  * @throws IOException in case an I/O occurs.
  */
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    nameparam = config.getInitParameter("name");
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    try (final PrintWriter out = response.getWriter()) {
      out.println("Hello"+" "+nameparam);
    }
  }
}
