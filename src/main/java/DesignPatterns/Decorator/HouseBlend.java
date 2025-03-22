package DesignPatterns.Decorator;

public class HouseBlend extends Beverage {
    @Override
    public int getCost() {
        return 250;
    }

    @Override
    public void getDescription() {
        System.out.println("HouseBlend");
    }
}
