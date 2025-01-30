package interfaces.Stack;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        Stack stack = new (anyone who has implemented stack);

        System.out.println("Which stack do you want to use ?");
        String stackType = scanner.nextLine();
        Stack stack = StackFactory.createStackByType(stackType);
        stack.push(1);

//        stack.push(1);
//        stack1.push(2);
//        stack2.push(3);



    }
}
