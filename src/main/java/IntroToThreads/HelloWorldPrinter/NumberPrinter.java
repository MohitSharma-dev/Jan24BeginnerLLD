package IntroToThreads.HelloWorldPrinter;

public class NumberPrinter implements Runnable{
    int input;

    NumberPrinter(int input) {
        this.input = input;
    }

    @Override
    public void run() {
        System.out.println(input + " in Thread :" + Thread.currentThread().getName());
    }
}

