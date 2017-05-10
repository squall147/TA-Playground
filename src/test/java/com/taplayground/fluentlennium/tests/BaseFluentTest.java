package com.taplayground.fluentlennium.tests;

import com.taplayground.fluentlennium.utils.ChromeDriverCreator;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.openqa.selenium.WebDriver;

@FluentConfiguration(webDriver="chrome")
public class BaseFluentTest extends FluentTest {

    public WebDriver newWebDriver() {
        return ChromeDriverCreator.createDriver();
    }
}
