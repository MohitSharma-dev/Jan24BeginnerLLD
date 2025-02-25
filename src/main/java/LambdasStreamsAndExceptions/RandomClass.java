package LambdasStreamsAndExceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class RandomClass {
    void randomMethod3() throws FileNotFoundException {
        randomMethod2(6);
    }

    void randomMethod(int x) {
        try {
            randomMethod2(5);
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found! Please go and check if file exists properly");
        } catch (Exception ex) {
            System.out.println("Some Issue has happened!");
        } finally {
//             finally will always run
//            does the clean up
            System.out.println("Database connection closed");
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


// Advance Programming Concepts

// Test : https://docs.google.com/document/d/1o6FdM_3j4NacEfFVm3ZFAXu9I_dOp3oEBW056V72Y2Y/edit?tab=t.0#heading=h.m4vfwkjm2dgv




