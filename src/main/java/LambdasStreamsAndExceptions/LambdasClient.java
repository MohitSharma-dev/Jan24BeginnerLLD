package LambdasStreamsAndExceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class LambdasClient {
    public static void main(String[] args) {
        // define a lambda expression
        // Instead of creating a class, you just implemented method
        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread t = new Thread(() -> {
            System.out.println("Hello World Again!");
        });

        Callable<Integer> callable = () -> {
            return 5 + 4;
        };

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list, (arg1 , arg2) -> {
            // every odd number should come first
            if(arg1 % 2 != 0){
                return -1;
            } else if (arg2 % 2 != 0){
                return 1;
            }
            return 0;
        });
        System.out.println(list);
    }
}

// Older way
// HelloWorldClass => Implemented Runnable interface

// write a class : comparator
