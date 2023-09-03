package com.domy.bdd.Cucumber;

/*import com.google.common.io.Files;
import org.apache.log4j.Logger;

import com.stacks.bdd.cucumber.runner.GlobalState;
import com.cucumber.listener.Reporter;*/

/*import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;*/



import adapter.driver.com.AndroidAutomatedDriver;
import command.driver.com.ClickCommand;
import command.driver.com.CommandControl;
import command.driver.com.SendKeysCommand;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ScenarioHooks {

    public static AppiumDriver<AndroidElement> webdriverInstance;

    private static final long NANO_TO_SECONDS = 1000000000;

    private long timeExecutingTask = 0;


    public ScenarioHooks() {

    }

    @Before(order = 1)
    public void createWebDriver() throws MalformedURLException {
        AndroidAutomatedDriver Automated = new AndroidAutomatedDriver();
        webdriverInstance= Automated.getWebDriverInstance();




    }







}
