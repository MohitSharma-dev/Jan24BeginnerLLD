package ProducerConsumer.ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore, consumerSemaphore;

    public Consumer(Store store, Semaphore producerSemaphore , Semaphore consumerSemaphore) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }
    @Override
    public void run() {
        while(true){
//            if items are available then consume

            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            store.remove();

            producerSemaphore.release();

        }
    }
}


// consumer count --;
// consume
// producer count ++;