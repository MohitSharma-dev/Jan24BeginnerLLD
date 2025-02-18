package InventoryManagementSystem;

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
        Collections.sort(items);
        System.out.println("Sorted Items List : ");
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}

// 4 1 2 5 3 7 8
// Sort this : 1 2 3 4 5 7 8 : Natural Order

// In which order : count of factors :  1 2 3 5 7 4 8