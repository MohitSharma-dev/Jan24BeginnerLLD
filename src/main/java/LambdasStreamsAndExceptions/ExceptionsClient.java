package LambdasStreamsAndExceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionsClient {
    public static void main(String[] args) throws FileNotFoundException {
//        ArithmeticException
        System.out.println(1 / 0);
        RandomClass randomClass = new RandomClass();
        randomClass.randomMethod(10);
        randomClass.randomMethod3();
    }
}
