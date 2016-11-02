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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CrasyFox
 */
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        ItemControl ic = new ItemControl();
        int id = Integer.parseInt(request.getParameter("id"));
        boolean test = true;
        int cont = 0;        

        if (session.getAttribute("order") == null) {
            session.setAttribute("order", new Order());
        }

        Order order = (Order) session.getAttribute("order");

        if (order.getItems() != null) {
            for (Item item : order.getItems()) {
                if (item.id == id) {
                    test = false;
                    order.getItems().get(cont).amount += 1;                                        
                }
                cont += 1;
            }

        }
        if (test) {
            Item item = ic.returnItem(id);
            item.amount = 1;
            order.addItem(item);            
        }

        session.setAttribute("order", order);        
        response.sendRedirect("tools/main.jsp");
    }   
}
