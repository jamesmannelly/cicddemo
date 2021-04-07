package login;

import datadog.trace.api.Trace;
import org.apache.log4j.Logger;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private final static Logger logger = Logger.getLogger(Login.class);

  @Trace
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    logger.info("Hello world");
    response.sendRedirect(request.getContextPath() + "/login.jsp");
  }
}
