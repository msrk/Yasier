package adapter.driver.com;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class ActualIOSDriver implements IOSAutomatedDriver {
    public AppiumDriver<AndroidElement> getWebDriverInstance(){
        return null;
    }
}
