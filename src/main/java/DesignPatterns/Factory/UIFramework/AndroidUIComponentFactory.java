package DesignPatterns.Factory.UIFramework;

import DesignPatterns.Factory.UIFramework.components.Button.AndroidButton;
import DesignPatterns.Factory.UIFramework.components.Button.Button;
import DesignPatterns.Factory.UIFramework.components.Menu.AndroidMenu;
import DesignPatterns.Factory.UIFramework.components.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
