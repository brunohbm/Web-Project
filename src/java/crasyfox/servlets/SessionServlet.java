/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.servlets;

import crasyfox.control.Item;
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("order") == null){
            session.setAttribute("order", new Order());
        }
        
        Order order = (Order) session.getAttribute("order");
        
        boolean test = false;
        
        for (Item item : order.getItems()){
//            if(item.id = ){
//                test = true;
//            }
        }
        if(test){
            
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
