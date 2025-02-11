package MultiThreading2.AdderSubtractorSynchronizedMethod;

public class Value {
    private long x = 0;
//
//    public long getX() {
//        return x;
//    }
//
//    public void setX(long x) {
//        this.x = x;
//    }

    synchronized void incrementBy(long v){
        x += v;
    }

    synchronized void decrementBy(long v){
        x -= v;
    }
}
// adder calls => value.incrementBy => take the control of value
// subtractor calls decrementby => ask for the control => adder has the control => sub will have to wait