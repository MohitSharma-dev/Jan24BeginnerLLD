package ProducerConsumer.ProducerConsumerV0;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
//        any producer needs to constantly produce the item
        while (true) {
            if(store.getMAX_SIZE() > store.getItems().size())
            store.add(new Object());
        }
    }
}
