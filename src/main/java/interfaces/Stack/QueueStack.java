package interfaces.Stack;

public class QueueStack implements Stack{
    @Override
    public void push(int value) {
        System.out.println("Added in the Queue Stack");
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
