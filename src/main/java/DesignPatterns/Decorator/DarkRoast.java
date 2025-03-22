package DesignPatterns.Decorator;

public class DarkRoast extends Beverage{
    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public void getDescription() {
        System.out.println("Decaf");
    }
}
