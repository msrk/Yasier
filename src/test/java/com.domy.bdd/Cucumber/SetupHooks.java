package com.domy.bdd.Cucumber;


import com.domy.bdd.pages.MainPage;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;


public class SetupHooks {

    public SetupHooks() {

    }
    private static boolean executed = false;
    private  MainPage mainPage;



//    private static CustomWebDriver globalDriver;

    public SetupHooks(MainPage mainPage) {
        this.mainPage = new MainPage();

    }


    @Before(order = 0)
    public void start() {
        this.mainPage = new MainPage();

    }


}
