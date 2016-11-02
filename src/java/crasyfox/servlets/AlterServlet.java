/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.servlets;

import crasyfox.control.Item;
import crasyfox.control.ItemControl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CrasyFox
 */
public class AlterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ItemControl ic = new ItemControl();
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String Description = request.getParameter("description");
        Double value = Double.parseDouble(request.getParameter("value"));
        ic.updateItem(new Item(id, name, Description, value));
        response.sendRedirect("tools/mainAdmin.jsp");
    }
}
