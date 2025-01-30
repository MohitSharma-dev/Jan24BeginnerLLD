package interfaces.Stack;

public class LinkedListStack implements Stack{
    @Override
    public void push(int value) {
        System.out.println("Added in LinkedListStack");
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }
}
