package DesignPatterns.Factory.UIFramework.components.Button;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS button clicked");
    }
}
