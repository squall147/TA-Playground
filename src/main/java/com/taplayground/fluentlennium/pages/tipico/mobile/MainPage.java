package com.taplayground.fluentlennium.pages.tipico.mobile;


import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends FluentPage {

    @FindBy(xpath = "//div[@class = 'barbottomleft arrow ']//div[@class = 'text' and text() = 'Login']")
    private FluentWebElement loginButton;

    public MainPage clickLoginButton() {
        loginButton.click();
        return this;
    }

}
