package DesignPatterns.Factory.UIFramework;

import DesignPatterns.Factory.UIFramework.components.Button.AndroidButton;
import DesignPatterns.Factory.UIFramework.components.Button.Button;
import DesignPatterns.Factory.UIFramework.components.Button.IOSButton;
import DesignPatterns.Factory.UIFramework.components.Menu.Menu;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String platformName = scanner.nextLine();
        // Simple Factory to create Platform object based on user Input
        Platform platform = PlatformFactory.getPlatformByName(platformName);

        // I want to create a button of this platform
//        Button button =  null;
//        if(platform instanceof Android) {
//            button = new AndroidButton();
//        } else if (platform instanceof IOS) {
//            button = new IOSButton();
//        }

        // factory method to create UI component factory object based on platform object
        UIComponentFactory uiComponentFactory = platform.createUIComponentFactory();

        // abstract factory to create multiple component objects
        Menu menu = uiComponentFactory.createMenu();
        Button button = uiComponentFactory.createButton();
        button.click();

    }
}
