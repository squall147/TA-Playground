package com.taplayground.fluentlennium.pages.tipico.mobile;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class BonusPopUp extends FluentPage {

    @FindBy(xpath = "//div[@class = 'close-modal']")
    private FluentWebElement closeBonusPopUp;

    public BonusPopUp closeBonusPopUp() {
        await().atMost(5, TimeUnit.SECONDS);
        if (closeBonusPopUp.displayed())
        {
            closeBonusPopUp.click();
        }
        return this;
    }
}
