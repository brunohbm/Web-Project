/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.servlets;

import crasyfox.control.Item;
import crasyfox.control.ItemControl;
import crasyfox.control.Order;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CrasyFox
 */
public class ControllerProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ItemControl ic = new ItemControl();
        Order order = (Order) request.getSession().getAttribute("order");
        Cookie[] cookie = request.getCookies();       
        String user = cookie[1].getValue();
        ic.end(order, user);
        request.getSession().removeAttribute("order");
        response.sendRedirect("tools/confirmPay.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short Description";
    }
}
