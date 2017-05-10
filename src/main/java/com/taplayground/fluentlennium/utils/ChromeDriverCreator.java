package com.taplayground.fluentlennium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator {

    public static WebDriver createDriver() {
        return createChromeDriver();
    }

    private static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", ChromeDriverExecutor.getProperDriverExecutable());
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }
}
