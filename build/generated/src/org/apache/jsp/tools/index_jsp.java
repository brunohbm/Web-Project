package org.apache.jsp.tools;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import crasyfox.servlets.LoginServlet;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>                \n");
      out.write("        <link rel=\"shortcut icon\" href=\"../img/icon.png\" type=\"image/png\">\n");
      out.write("        <title>I-Commerce Login</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">        \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/my-definitions.css\">       \n");
      out.write("\n");
      out.write("    </head>    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">                        \n");
      out.write("            <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("                <div class=\"account-wall\">                    \n");
      out.write("                    <img class=\"profile-img\" src=\"../tools/img/profile.png\" alt=\"Profile image\">\n");
      out.write("                    <h3 class=\"text-center\">I.M.T.W GAMES</h3>\n");
      out.write("                    <form class=\"form-signin\" action=\"  ../Login\" method=\"POST\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">                            \n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"user\" aria-describedby=\"sizing-addon1\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\" aria-describedby=\"sizing-addon1\">\n");
      out.write("                            <button class=\"btn btn-lg btn-danger btn-block\" type=\"submit\"><img id=\"image-icon\" src=\"img/icon-controller.png\"></button>\n");
      out.write("                        </div>                          \n");
      out.write("                    </form>\n");
      out.write("                    ");

                        if (LoginServlet.test) {
                    
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"alert\">\n");
      out.write("                        <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                        <img src=\"img/error.png\" style=\"width: 44px; height: 44px; margin-right: 26px; margin-left: 8px\">Username or password incorret !\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                        LoginServlet.test = false;
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/app.js\"></script>\n");
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
