package com.taplayground.fluentlennium.pages.tipico.mobile;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends FluentPage {

    @FindBy(name = "username")
    private FluentWebElement userNameField;

    @FindBy(xpath = "password")
    private FluentWebElement passwordField;

    @FindBy(xpath = "//input[@class = 'submit']")
    private FluentWebElement loginButton;

    @FindBy(xpath = "//div[@class = 'bigbutton']//div[@class = 'text' and text() = 'Login']")
    private FluentWebElement confirmButton;

    public LoginPage fillLoginform(String userName, String password) {
        await().atMost(5, TimeUnit.SECONDS).until(userNameField).displayed();
        userNameField.clear();
        userNameField.write(userName);
        loginButton.clear();
        loginButton.write(password);
        return this;
    }

    public LoginPage clickLogonButton() {
        loginButton.click();
        return this;
    }

    public LoginPage clickConfirmButton() {
        confirmButton.click();
        return this;
    }
}
