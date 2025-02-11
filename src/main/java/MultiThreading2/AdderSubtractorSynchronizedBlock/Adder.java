package MultiThreading2.AdderSubtractorSynchronizedBlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;
    public Adder(Value value, Lock lock) {
        this.value = value;
    }

//    you can't pass anything in the call method

    @Override
    public Void call() throws Exception {
//        add from 1->100
        for(long i = 0; i <=100000; i++){
//            System.out.println("Adding " + i);
            synchronized (value){
                value.setX(value.getX()+i);
            }
        }
        return null;
    }
}
