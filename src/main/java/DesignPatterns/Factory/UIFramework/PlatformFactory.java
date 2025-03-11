package DesignPatterns.Factory.UIFramework;

public class PlatformFactory {
    public static Platform getPlatformByName(String platformName) {
        Platform platform = null;
        if(platformName.equals("Android")) {
            platform = new Android();
        } else if(platformName.equals("IOS")) {
            platform = new IOS();
        }
        return platform;
    }
}
