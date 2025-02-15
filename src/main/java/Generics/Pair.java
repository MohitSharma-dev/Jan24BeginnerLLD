package Generics;

public class Pair <T , V>{
    T first;
    V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public <K> K doSomething(K something){
        return something;
    }
}
