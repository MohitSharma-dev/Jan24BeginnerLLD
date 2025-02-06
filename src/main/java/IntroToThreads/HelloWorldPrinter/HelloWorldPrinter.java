package IntroToThreads.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {
    public void print(){
        System.out.println("Hello World from " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}



// Runnable interface : run
// run : can't return any data

// What if you want to return some data from thread ?
// Callable interface