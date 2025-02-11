package ProducerConsumer.ProducerConsumerV0;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        while(true){
//            if items are available then consume
            if(store.getItems().size() > 0){
                store.remove();
            }
        }
    }
}
