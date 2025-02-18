package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>{
//    we need to store the items
//    We can store the items using a basic List

//    But it is mentioned , fast lookups using ID
    private HashMap<String , T> items;
    Inventory(){
        items = new HashMap<>();
    }

//    core methods : add , remove , retrieve , list all the items
    public void add(T item){
        items.put(item.getId() , item);
    }

    public void remove(T item){
        items.remove(item.getId());
    }

    public void remove(String itemId){
        items.remove(itemId);
    }

    public T getItem(String itemId){
        return items.get(itemId);
    }

    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }
}

// new Inventory<Animal>();
// we don't want this

// we should be creating inventory for only Item or anything under Item