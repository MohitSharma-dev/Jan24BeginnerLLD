package DesignPatterns.Factory.UIFramework;

import DesignPatterns.Factory.UIFramework.components.Button.Button;
import DesignPatterns.Factory.UIFramework.components.Button.IOSButton;
import DesignPatterns.Factory.UIFramework.components.Menu.IOSMenu;
import DesignPatterns.Factory.UIFramework.components.Menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
