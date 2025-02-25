package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsAndExceptionsClient {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop", 5 , 999.99, 24));
        items.add(new Clothing("C1", "T-Shirt", 100 ,19.99, "M"));
        items.add(new Book("B1", "Java Programming", 50, 59.99, "John Doe"));

//        Print all item IDs in the inventory using map.

            items
                .stream()
                .map((item) -> {
                    return item.getId();
                })
                .forEach((data) -> {
                    System.out.println(data);
                });

//        Create a list of item names in lowercase and print it.
            items
                    .stream()
                    .map((item) -> {
                        return item.getName().toLowerCase();
                    })
                    .collect(Collectors.toList());

//        Calculate the total quantity of all items in the inventory.
        int totalQuantity = 0;

        for(Item item : items) {
            totalQuantity += item.getQuantity();
        }

            items
                .stream()
                .map(data -> data.getQuantity())
                .reduce(0 , (total , quantity) -> {
                    total = total + quantity;
                    return total;
                });
//        Find the most expensive item using reduce.
        double ans1 = items.stream()
                .map(data -> data.getPrice())
                .reduce(Double.MIN_VALUE , (ans , price) -> {
                    return Math.max(ans , price);
                });
        System.out.println(ans1);
//        Concatenate all item names into a single comma-separated string.
            String sol = items.stream()
                    .map(data -> data.getName())
                    .reduce("" ,(ansString , curr)->{
                        if(ansString.equals("")) {
                            return curr;
                        }
                        return ansString + "," + curr;
                    });
        System.out.println(sol);

        Optional<String> sol1 = items.stream()
                .map(data -> data.getName())
                .reduce((ansString , curr)->{
                    return ansString + " " + curr;
                });
        System.out.println(sol1.get());

//        item Name : price
//        String : double

       Map<String , Double> map =  items
                .stream()
                .collect(Collectors.toMap(
                        item -> item.getName(),
                        item -> item.getPrice()
                ));

        System.out.println(map);








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
    }
}
