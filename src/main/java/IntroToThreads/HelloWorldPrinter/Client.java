package IntroToThreads.HelloWorldPrinter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = new HelloWorldPrinter();
        System.out.println("Main : " + Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start(); // Thread - 0
        new HelloWorldPrinter().print(); // main thread

        Thread thread1 = new Thread(new SumCalculation(55));
        thread1.start();

        int input = 10;
        for(int i = 1 ; i <= input ; i++) {
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

//        execute (Runnable)
        for(int i = 1 ; i <= 100; i ++){
            executorService.execute(new NumberPrinter(i));
        }

        ExecutorService fibonaaciExecutorService = Executors.newCachedThreadPool();
        Future<Integer> ansFuture = fibonaaciExecutorService.submit(new FibonnaciNumber(3, fibonaaciExecutorService));
        int ans = ansFuture.get();
        System.out.println(ans);
    }
}

// task1 : Print Hello world in a separate thread
// Task2 : Write a program which calculates/prints the sum from 1 -> 100 in a separate thread
// Task3 : print the sum 1 -> N where N is input in a separate thread
// Task4 : print the number from 1->N but each in a separate thread (Order doesn't matter)

