/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.control;

import java.util.ArrayList;

/**
 *
 * @author CrasyFox
 */
public class Order {
    
    private int id;
    private ArrayList<Item> items;
    private double total;
    
    public void addItem(Item item){
        if(this.items == null){
            this.items = new ArrayList<Item>();
        }
        this.items.add(item);
    }
    
    public void removeItem(Item item){
        for(Item itemArray : items){
            if(itemArray.id == item.id){
                items.remove(itemArray);
            }
        }
    }
    
    public double sumTotal(){
        total = 0;
        for(Item item : items){
         total += item.value;
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
