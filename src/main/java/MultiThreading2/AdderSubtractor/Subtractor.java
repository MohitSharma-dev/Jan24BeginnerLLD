package MultiThreading2.AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;

    public Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(long i = 0; i <=100000; i++){
//            System.out.println("Subtracting " + i);
            value.setX(value.getX()-i);
        }
        return null;
    }
}
