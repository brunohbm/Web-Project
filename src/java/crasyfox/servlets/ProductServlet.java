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
public class ProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double value = Double.parseDouble(request.getParameter("value"));
        
        try {
            ConnectionMySQL con = new ConnectionMySQL();
            PreparedStatement pstm = con.connect.prepareStatement("INSERT INTO ITEM VALUES (?,?,?,?)");
            pstm.setInt(1, Integer.parseInt(con.autoIncrement("ID", "ITEM")));
            pstm.setString(2, name);
            pstm.setString(3, description);
            pstm.setDouble(4, value);
            pstm.executeQuery();            
            response.sendRedirect("tools/mainAdmin.jsp");
        } catch (SQLException e) {
            System.out.println("error to create" + e);
            response.sendRedirect("tools/register.jsp");
        }
    }
}
