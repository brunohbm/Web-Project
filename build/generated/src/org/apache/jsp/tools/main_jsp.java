package org.apache.jsp.tools;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import crasyfox.control.ItemControl;
import java.util.ArrayList;
import crasyfox.control.Item;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>   \n");
      out.write("    <head>                \n");
      out.write("        <link rel=\"shortcut icon\" href=\"../tools/img/icon.png\" type=\"image/png\">\n");
      out.write("        <title>I-Commerce Home</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">        \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/my-definitions.css\">                   \n");
      out.write("        <style>\n");
      out.write("            .affix {\n");
      out.write("                top: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                -webkit-transition: all .5s ease-in-out;\n");
      out.write("                transition: all .5s ease-in-out;\n");
      out.write("                background-color: #F44336;\n");
      out.write("                border-color: #F44336;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("            .affix a {\n");
      out.write("                color: #fff !important;\n");
      out.write("                padding: 15px !important;\n");
      out.write("                -webkit-transition: all .5s ease-in-out;\n");
      out.write("                transition: all .5s ease-in-out;\n");
      out.write("            }\n");
      out.write("            .affix-top a {\n");
      out.write("                padding: 25px !important;\n");
      out.write("            }\n");
      out.write("            .affix + .container-fluid {\n");
      out.write("                padding-top: 95px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\" style=\"background-color:#F44336;color:#fff;height:200px;\">\n");
      out.write("            <img src=\"img/mainPageIcon.png\" style=\"margin-right: 45px;  \"> <text style=\"font-size: 40px\" >I.M.T.W Games Shop</text>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"navbar navbar-inverse\" data-spy=\"affix\" data-offset-top=\"197\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"cart.jsp\"><img src=\"img/productsIcon.png\" id=\"iconPage\">Shopping Cart</a></li>                                    \n");
      out.write("            </ul>                \n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\" style=\"height:1000px\">            \n");
      out.write("            <table class=\"table table-bordered\" style=\"background-color: white\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr style=\"background-color:  gray\">\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Description</th>\n");
      out.write("                        <th>Value</th>                                                        \n");
      out.write("                        <th></th>                                                      \n");
      out.write("                    </tr>                         \n");
      out.write("                </thead>\n");
      out.write("                <tbody>                   \n");
      out.write("                    ");

                        ItemControl ic = new ItemControl();
                        ArrayList<Item> items = ic.returnItems();
                        for (Item item : items) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(item.name);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(item.description);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(item.value);
      out.write("</td>                \n");
      out.write("                        <td> <a class=\"btn btn-warning\" href=\"../SessionServlet?id=");
      out.print(item.id);
      out.write("\">Add</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
