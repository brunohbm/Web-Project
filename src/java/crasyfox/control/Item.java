/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crasyfox.control;

/**
 *
 * @author CrasyFox
 */
public class Item {
    
   public int id;
    public String name;
    public String description;
    public int amount;
    public double value;

    public Item(int id, String name, String description, double value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
    }
    
    
    
}
