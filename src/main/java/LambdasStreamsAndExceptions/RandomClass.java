package LambdasStreamsAndExceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class RandomClass {
    void randomMethod(int x) {
        try {
            randomMethod2(5);
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found! Please go and check if file exists properly");
        } catch (Exception ex) {
            System.out.println("Some Issue has happened!");
        }

    }

    void randomMethod2(int x) throws FileNotFoundException {
        if(x % 2 == 0){
            // Run time exception : unchecked
            throw new NullPointerException();
        } else if (x % 2 != 0){
            // Exception : checked
            // either you tell out loud, hey I might throw this exception
            // you should handle it
            throw new FileNotFoundException();
        }
    }
}
