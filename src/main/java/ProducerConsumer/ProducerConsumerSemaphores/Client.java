package ProducerConsumer.ProducerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 20; i ++){
            executorService.execute(new Producer(store, producerSemaphore , consumerSemaphore));
        }

        for(int i = 0 ; i < 8; i ++){
            executorService.execute(new Consumer(store, producerSemaphore , consumerSemaphore));
        }
    }
}

// KAFKA  : Queue
// Producers (Event) -> Queue Consumers -> (Event)

// Order placed
    // Notifications => Customer , Seller
    // Update the inventory


// Queue (Notify Customer , Notify Seller , Update the inventory) => Consumer