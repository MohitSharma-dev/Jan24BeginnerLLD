package interfaces.Stack;

public class StackFactory {
    public static Stack createStackByType(String stackType) {
        Stack stack = null;
        if(stackType.equals("Array")){
            stack = new ArrayStack();
        } else if(stackType.equals("LinkedList")){
            stack = new LinkedListStack();
        } else if (stackType.equals("Queue")){
            stack = new QueueStack();
        }
        return stack;
    }
}
