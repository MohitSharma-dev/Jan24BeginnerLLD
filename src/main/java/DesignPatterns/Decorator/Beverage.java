package DesignPatterns.Decorator;

public abstract class Beverage {
    private int cost;
    private String description;

    public abstract int getCost();
    public abstract void getDescription();
}
