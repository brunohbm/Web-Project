/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.control;

import crasyfox.connection.ConnectionMySQL;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CrasyFox
 */
public class ItemControl extends ConnectionMySQL {

    public void end(Order order, String user){
         try {
            int idOrder = Integer.parseInt(autoIncrement("ID_ORDER", "ORDERS"));
             includeSQL("INSERT INTO ORDERS VALUES ("+idOrder+", '"+user+"')");
             for(Item item : order.getItems()){
                 includeSQL("INSERT INTO ITEM_ORDER VALUES ("+item.id+", "+idOrder+", "+item.amount+", "+item.value+")");
             }
        } catch (Exception e) {
        }
         
    }
    
    public ArrayList<Item> returnItems() {
        ArrayList<Item> items = new ArrayList();
        try {
            runSQL("SELECT * FROM ITEM");

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_ITEM");
                String name = resultSet.getString("NM_ITEM");
                String description = resultSet.getString("DS_ITEM");
                double value = resultSet.getDouble("VL_ITEM");
                items.add(new Item(id, name, description, value));
            }
        } catch (SQLException e) {
            System.out.println("not is possible to return the items " + e);
        }
        return items;
    }

    public Item returnItem(int cod) {
        try {
            runSQL("SELECT * FROM ITEM WHERE ID_ITEM = " + cod);

            resultSet.first();
            int id = resultSet.getInt("ID_ITEM");
            String name = resultSet.getString("NM_ITEM");
            String description = resultSet.getString("DS_ITEM");
            double value = resultSet.getDouble("VL_ITEM");         
            return new Item(id, name, description, value);
        } catch (Exception e) {
            return null;
        }           
    }
    
    public void updateItem(Item item){
        updateSQL("UPDATE ITEM SET NM_ITEM = '" + item.name + "', DS_ITEM = '"+ item.description +"', VL_ITEM = " + item.value + " WHERE ID_ITEM = "+ item.id);
    }
    
       public void deleteItem(String id){
           deleteSQL("DELETE FROM ITEM WHERE ID_ITEM = "+id);
    }
}
