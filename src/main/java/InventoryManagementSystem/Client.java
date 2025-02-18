package InventoryManagementSystem;

import polymorphism.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop", 5 , 999.99, 24));
        items.add(new Clothing("C1", "T-Shirt", 100 ,19.99, "M"));
        items.add(new Book("B1", "Java Programming", 50, 59.99, "John Doe"));
        System.out.println("Items List : ");
        for (Item item : items) {
            System.out.println(item.getName());
        }
//      There is no default ordering for custom classes
//        Is it possible to give default ordering : Yes ! How ? Comparable
//        items.get(0).compareTo(items.get(1));
        Collections.sort(items); // it will natural ordering : comparbale
        Collections.sort(items, new ItemQuantityComparator());
        System.out.println("Sorted Items List : ");
        for (Item item : items) {
            System.out.println(item.getName());
        }

//        Inventory : Multiple Items
//        General Inventory
//        Clothing Inventory
//        Book Inventory

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1", "Laptop",5 ,  999.99 , 24));
        electronicsInventory.add(new Electronics("E2", "Laptop",5 ,  999.99 , 24));
        electronicsInventory.add(new Electronics("E3", "Mobile",5, 99.99, 24));

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();
        Inventory<Item> itemInventory = new Inventory<>();

        Item item1 = new Electronics("E1", "Laptop", 5 , 999.99, 24);
        Item item2 = new Electronics("E2", "Mobile", 5 , 999.99, 24);
        Item item3 = new Electronics("E3", "Watch", 5 , 999.99, 24);
        Item item4 = new Electronics("E4", "Ipad", 5 , 999.99, 24);
        Item item5 = new Electronics("E5", "Speaker", 5 , 999.99, 24);

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();

        recentlyViewedItems.addRecentlyViewedItem(item3);
        recentlyViewedItems.addRecentlyViewedItem(item1);
        recentlyViewedItems.addRecentlyViewedItem(item5);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5);

        System.out.println("RecentlyViewedItems List : ");
        List<Item> recentlyViewedItemsList = recentlyViewedItems.getRecentlyViewedItems();
        for (Item item : recentlyViewedItemsList) {
            System.out.println(item.getName());
        }
    }
}

// 4 1 2 5 3 7 8
// Sort this : 1 2 3 4 5 7 8 : Natural Order

// In which order : count of factors :  1 2 3 5 7 4 8


// Use case : 10 most Recently Viewed Items
// what collection you will prefer ?
// size = 3
// airJordans iphone lego

// delete from one end
// insert at another
// search & delete from between

// LinkedList + Hashmap
// LRU cache : LL + hashmap => LinkedHashMap

