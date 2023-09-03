package com.domy.bdd.pages;

import command.driver.com.ClickCommand;
import command.driver.com.CommandControl;
import command.driver.com.SendKeysCommand;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.reporters.jq.Main;

import static com.domy.bdd.Cucumber.ScenarioHooks.webdriverInstance;

public class MainPage {
   AppiumDriver<AndroidElement> driver ;
    public MainPage(){
        setDriver( webdriverInstance);
    }

    public void setDriver(AppiumDriver<AndroidElement> driver){
        this.driver=driver;
    }
    public void gotToFav(){
        ClickCommand clickCommand = new ClickCommand(driver);
        SendKeysCommand SendKeysCommand = new SendKeysCommand(driver);
        CommandControl commadControl = new CommandControl();
        commadControl.setCommand(clickCommand);
        commadControl.performClick(By.id("id.ihwan.jetpackpro.debug:id/homeViewPager"));
    }

    public void addVideoToVaf(){
        ClickCommand clickCommand = new ClickCommand(driver);
        SendKeysCommand SendKeysCommand = new SendKeysCommand(driver);
        CommandControl commadControl = new CommandControl();
        commadControl.setCommand(clickCommand);
        commadControl.performClick(By.id("id.ihwan.jetpackpro.debug:id/favorite_button"));
    }


    public void vafVideo(){
        ClickCommand clickCommand = new ClickCommand(driver);
        SendKeysCommand SendKeysCommand = new SendKeysCommand(driver);
        CommandControl commadControl = new CommandControl();
        commadControl.setCommand(clickCommand);
        commadControl.performClick(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
        commadControl.performClick(By.id("id.ihwan.jetpackpro.debug:id/favorite"));
        commadControl.performClick(By.id("id.ihwan.jetpackpro.debug:id/imageMovies"));


    }
}
