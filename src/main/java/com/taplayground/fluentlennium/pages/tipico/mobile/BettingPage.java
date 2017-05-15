package com.taplayground.fluentlennium.pages.tipico.mobile;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class BettingPage extends FluentPage {

    @FindBy(id = "my-account-button-login")
    private FluentWebElement myAccountButton;

    public BettingPage clickMyAccountButton(){
        await().atMost(5, TimeUnit.SECONDS).until(myAccountButton).displayed();
        myAccountButton.click();
        return this;
    }
}
