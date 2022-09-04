package models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getitem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public boolean add(Item item) {
        if (!this.items.contains(item)) {
            this.items.add(new Item(item));
            return true;
        }
        return false;
    }

    public void remove(String name) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Cart is empty!");
        }
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equals(name)) {
                this.items.remove(this.items.get(i));
            }
        }
    }

    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Cart is empty!");
        }
        double subtotal = 0;
        double tax;
        double total;
        for (int i = 0; i < this.items.size(); i++) {
            subtotal += this.items.get(i).getPrice();
        }
        tax = 0.13 * subtotal;
        total = subtotal + tax;
        
        return "\tRECEIPT\n\n" + 
                "\tSubtotal: $" + subtotal + "\n" +
                "\tTax: $" + tax + "\n" +
                "\tTotal: $" + total + "\n";
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }
   /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */

 
 
  
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */

 
 
  
   /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    
}
