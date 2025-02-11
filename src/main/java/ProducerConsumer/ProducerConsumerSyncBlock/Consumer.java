package ProducerConsumer.ProducerConsumerSyncBlock;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        while(true){
//            if items are available then consume
            synchronized (store){
                if(store.getItems().size() > 0){
                    store.remove();
                }
            }
        }
    }
}
