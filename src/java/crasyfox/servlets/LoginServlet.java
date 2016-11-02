package crasyfox.servlets;

import crasyfox.control.LoginController;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CrasyFox
 */
public class LoginServlet extends HttpServlet {

    public static boolean test = false;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LoginController LoginContr = new LoginController();
        
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        if (LoginContr.login(user, password)) {
            response.addCookie(LoginContr.getCookie("user", user));
            response.addCookie(LoginContr.getCookie("password", password));
            response.addCookie(LoginContr.getCookie("type", LoginContr.getType()));

            if(LoginContr.getType().equals("ADMIN")){
                response.sendRedirect("tools/mainAdmin.jsp");
            }else{
                response.sendRedirect("tools/main.jsp");
            }
        } else {
            test = true;
            response.sendRedirect("tools/index.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short Description";
    }

    public static boolean returnTest() {
        return test;
    }
}
