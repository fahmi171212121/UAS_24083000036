/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author myxps
 */
public class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter methods
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    
    @Override
    public String toString() {
        return name + " - Rp" + price + " (" + category + ")";
    }
}

