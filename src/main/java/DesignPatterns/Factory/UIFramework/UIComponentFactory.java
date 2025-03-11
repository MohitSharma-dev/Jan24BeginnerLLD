package DesignPatterns.Factory.UIFramework;

import DesignPatterns.Factory.UIFramework.components.Button.Button;
import DesignPatterns.Factory.UIFramework.components.Menu.Menu;

public interface UIComponentFactory {
    abstract Button createButton();
    abstract Menu createMenu();
}
