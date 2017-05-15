package com.taplayground.fluentlennium.pages.tipico.mobile;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MyAccountPage extends FluentPage {

    @FindBy(xpath = "//span[@class = 'form-header ng-binding']")
    private FluentWebElement loggedNamePanel;

    public String checkLoggedName(){
        await().atMost(5, TimeUnit.SECONDS).until(loggedNamePanel).displayed();
        return loggedNamePanel.textContent();
    }
}
