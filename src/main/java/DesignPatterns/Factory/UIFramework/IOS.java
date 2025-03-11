package DesignPatterns.Factory.UIFramework;

public class IOS extends Platform{
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
