package DesignPatterns.Decorator;

public class Decaf extends Beverage {
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public void getDescription() {
        System.out.println("Decaf");
    }
}
