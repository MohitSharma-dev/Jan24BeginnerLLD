package MultiThreading2.AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;
    public Adder(Value value) {
        this.value = value;
    }

//    you can't pass anything in the call method

    @Override
    public Void call() throws Exception {
//        add from 1->100
        for(long i = 0; i <=100000; i++){
//            System.out.println("Adding " + i);
            value.setX(value.getX()+i);
        }
        return null;
    }
}
