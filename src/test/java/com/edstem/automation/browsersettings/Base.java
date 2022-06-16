package com.edstem.automation.browsersettings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
    public static Properties prop;

    public static WebDriver chromeBrowser() {
        readConfiguration();
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("step1");
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver firefoxBrowser() {
        readConfiguration();
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\FireFoxDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        System.out.println("step1");
        //driver.manage().window().maximize();
        return driver;
    }

    public static void readConfiguration() {
        try {
            prop = new Properties();
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir")
                    + "/src/test/resources/Properties_File/config.properties");
            prop.load(fs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
