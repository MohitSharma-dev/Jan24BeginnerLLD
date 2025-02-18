package InventoryManagementSystem;

import java.util.Comparator;

// sort acc to desc order of quantity
public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
//        o1 to comes first => return -1
//        o2 to comes first => return 1
        if(o1.getQuantity() < o2.getQuantity()){
            return 1;
        } else if(o1.getQuantity() > o2.getQuantity()){
            return -1;
        }
        return 0;
    }
}
