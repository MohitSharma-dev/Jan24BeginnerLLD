package DesignPatterns.Factory.UIFramework.components.Menu;

public class IOSMenu implements Menu{
    @Override
    public void showOptions() {
        System.out.println("IOS Menu options!");
    }
}
