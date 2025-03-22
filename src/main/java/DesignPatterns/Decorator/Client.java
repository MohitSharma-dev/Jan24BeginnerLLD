package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();
        System.out.println("Cost " + beverage.getCost());
        beverage.getDescription();

        // HouseBlend with Whip

        beverage = new Whip(beverage);
        System.out.println("Cost " + beverage.getCost());
        beverage.getDescription();

        // Double Mocha HouseBlend with Whip and Milk
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println("Cost " + beverage.getCost());
        beverage.getDescription();

    }
}
