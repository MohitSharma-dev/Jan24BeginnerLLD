package DesignPatterns.Decorator;

public class Whip extends AddOn {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 20 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Whip");
    }
}
