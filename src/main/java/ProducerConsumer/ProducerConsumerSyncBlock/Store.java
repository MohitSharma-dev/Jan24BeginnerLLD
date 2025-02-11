package ProducerConsumer.ProducerConsumerSyncBlock;

import java.util.ArrayList;
import java.util.List;

public class Store {
//    we are going to have multiple items
    private List<Object> items = new ArrayList<>();
    private int MAX_SIZE = 5;

    public void add(Object item) {
        System.out.println("Item is being produced : " + items.size());
        items.add(item);
    }

    public void remove() {
        System.out.println("Item is being consumed : " + items.size());
        items.remove(items.size() - 1);
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public List<Object> getItems() {
        return items;
    }
}
