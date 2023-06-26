package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>LOGIN MIXLANY</title>\n");
      out.write("        <link rel=\"icon\" href=\"img/icono.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a81368914c.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img class=\"wave\" src=\"img/wave.png\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"img\">\n");
      out.write("                <img src=\"img/bg.png\" width=\"300\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login-content\">\n");
      out.write("                <form action=\"Validar\" method=\"POST\">\n");
      out.write("                    <img src=\"img/logo.png\" width=\"300\"/><br><br> \n");
      out.write("                    <h2 class=\"title\">Welcome</h2><br>\n");
      out.write("                    <h4>Username</h4>\n");
      out.write("                    <div class=\"input-div one\">\n");
      out.write("                        <div class=\"i\">\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"div\">\n");
      out.write("                            <input type=\"text\" name=\"txtuser\" autofocus required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   <h4>Password</h4>\n");
      out.write("                    <div class=\"input-div one\">\n");
      out.write("                        <div class=\"i\">\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"div\">\n");
      out.write("                            <input type=\"password\" name=\"txtpass\" autofocus required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn\">\n");
      out.write("                    ");
 if (request.getAttribute("Error") != null) {
                            out.println("<center><span class='bg-danger' style='font-weight: 900; padding: 10px;'>");
                            out.println(request.getAttribute("Error"));
                            out.println("</span></center>");
                        }
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
