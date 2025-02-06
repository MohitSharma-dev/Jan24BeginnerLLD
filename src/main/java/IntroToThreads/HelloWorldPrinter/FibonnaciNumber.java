package IntroToThreads.HelloWorldPrinter;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonnaciNumber implements Callable<Integer> {
    int n;
    ExecutorService executorService;

    FibonnaciNumber(int n, ExecutorService executorService) {
        this.n = n;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Calculate " + n + "th Fib using Thread " + Thread.currentThread().getName());
        if(n <= 1) return n;

//        two tasks
//        task1 : find the n - 1 fib
//        task2 : find the n - 2 fib

//        runnable : execute
//        callable : submit

//        fib(7) : Thread 7
//        Thread 8 : fib(6) =>
//        Thread 9 : fib(5) =>

//         we need to wait for the output
        Future<Integer> firstFuture = executorService.submit(new FibonnaciNumber(n-1, executorService));
        Future<Integer> secondFuture = executorService.submit(new FibonnaciNumber(n-2, executorService));

//        get of Future
        int x = firstFuture.get();
        int y = secondFuture.get();

        return x + y;

    }
}
