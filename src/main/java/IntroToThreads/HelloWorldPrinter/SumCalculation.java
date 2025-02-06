package IntroToThreads.HelloWorldPrinter;

public class SumCalculation implements Runnable{
    int input;

    SumCalculation(int input){
        this.input = input;
    }

    public void calculate(){
        int sum = 0;
        for(int i = 0 ; i <= input; i++){
            sum += i;
        }
        System.out.println("Sum : " + sum + " Thread : " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
//        you want the input to be available here
        calculate();
    }
}
