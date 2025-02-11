package MultiThreading2.AdderSubtractorSynchronizedMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;
    private Lock lock;
    public Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

//    you can't pass anything in the call method

    @Override
    public Void call() throws Exception {
//        add from 1->100
        for(long i = 0; i <=100000; i++){
//            System.out.println("Adding " + i);
            value.incrementBy(i);
        }
        return null;
    }
}
