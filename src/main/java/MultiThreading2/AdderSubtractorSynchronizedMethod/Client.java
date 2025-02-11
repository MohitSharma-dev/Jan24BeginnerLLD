package MultiThreading2.AdderSubtractorSynchronizedMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Value value = new Value();
//        the same lock should be used by both tasks

        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subtractorFuture = executorService.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

//        System.out.println(value.getX());
    }
}
