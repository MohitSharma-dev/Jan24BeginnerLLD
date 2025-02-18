package InventoryManagementSystem;

public class Book extends Item {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book(String id, String name, int quantity, double price, String author) {
        super(id, name, quantity, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
