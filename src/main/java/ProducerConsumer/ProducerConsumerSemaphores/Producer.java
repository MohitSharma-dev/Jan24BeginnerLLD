package ProducerConsumer.ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore, consumerSemaphore;

    public Producer(Store store, Semaphore producerSemaphore , Semaphore consumerSemaphore) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
//        any producer needs to constantly produce the item
        while (true) {
//            if(store.getMAX_SIZE() > store.getItems().size())
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//            produce the item
            store.add(new Object());

//            signal the consumer
            consumerSemaphore.release();

        }
    }
}

// producer count --;
// produce
// consumer count ++;