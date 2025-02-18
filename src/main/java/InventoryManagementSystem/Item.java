package InventoryManagementSystem;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private int quantity;
    private double price;

    public Item() {
    }

    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    default ordering rule : the item which has smaller price should come first in the sorted data

    @Override
    public int compareTo(Item other) {
//        this
//        other
//        this object to come before other => return -1
//        other object to come before this => return 1
        if(this.price > other.getPrice()) {
            return 1;
        } else if(this.price < other.getPrice()) {
            return -1;
        }

        return 0;
    }
}

// should I make Item class abstract ?

// Item : Clothing , Book ,Electronics
// item which doesn't lie in the category

