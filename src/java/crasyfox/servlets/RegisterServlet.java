/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.servlets;

import crasyfox.connection.ConnectionMySQL;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CrasyFox
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double value = Double.parseDouble(request.getParameter("value"));
        ConnectionMySQL con = new ConnectionMySQL();
        int id = Integer.parseInt(con.autoIncrement("ID_ITEM", "ITEM"));
        String query = ("INSERT INTO ITEM VALUES (" + id + ", '" + name + "', '" + description + "', " + value+")");
        con.includeSQL(query);
        response.sendRedirect("tools/mainAdmin.jsp");
    }
}
