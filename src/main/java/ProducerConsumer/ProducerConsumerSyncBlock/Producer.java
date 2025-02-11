package ProducerConsumer.ProducerConsumerSyncBlock;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
//        any producer needs to constantly produce the item
        while (true) {
            synchronized (store) {
                if(store.getMAX_SIZE() > store.getItems().size())
                    store.add(new Object());
            }
        }
    }
}
