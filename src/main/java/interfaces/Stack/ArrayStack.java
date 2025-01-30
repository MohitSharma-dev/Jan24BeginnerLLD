package interfaces.Stack;

public class ArrayStack implements Stack{
    @Override
    public void push(int value) {
        System.out.println("Added in a ArrayStack");
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
