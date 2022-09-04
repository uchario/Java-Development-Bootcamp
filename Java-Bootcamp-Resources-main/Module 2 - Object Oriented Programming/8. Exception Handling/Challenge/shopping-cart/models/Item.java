package models;

public class Item {
private String name;
private double price;

public Item(String name, double price) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("name must not be null/blank");
    }
    if (price < 0) {
        throw new IllegalArgumentException("price must be positive");
    }
    this.name = name;
    this.price = price;
}

public Item(Item source) {
    this.name = source.name;
    this.price = source.price;
}

public String getName() {
    return this.name;
}

public double getPrice() {
    return this.price;
}

public void setName(String name) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("name must not be null/blank");
    }
    this.name = name;
}

public void setPrice(double price) {
    if (price < 0) {
        throw new IllegalArgumentException("price must be positive");
    }
    this.price = price;
}

public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof Item)) {
        return false;
    }
    Item item = (Item) obj;
    return item.getName().equals(this.name) && item.getPrice() == this.price;
}

public String toString() {
    return this.name + ": $" + this.price + " "; 
}
  
}
