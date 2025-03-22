package DesignPatterns.Decorator;

public class Mocha extends AddOn{
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 15 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Mocha");
    }
}
