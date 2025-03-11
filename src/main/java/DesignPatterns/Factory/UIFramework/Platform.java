package DesignPatterns.Factory.UIFramework;

import DesignPatterns.Factory.UIFramework.components.Button.Button;
import DesignPatterns.Factory.UIFramework.components.Menu.Menu;

public abstract class Platform {
    // assume some methods of platform exists here

//    abstract Button createButton();
//    abstract Menu createMenu();

    abstract UIComponentFactory createUIComponentFactory();
}
