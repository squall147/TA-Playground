package com.taplayground.fluentlennium.tests;

import com.taplayground.fluentlennium.pages.tipico.mobile.*;
import com.taplayground.fluentlennium.utils.UrlProvider;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest extends BaseFluentTest{

    private String url = UrlProvider.SPORTSBOOK_COM.getUrl();

    @Page
    private MainPage mainPage;

    @Page
    private BonusPopUp bonusPopUp;

    @Page
    private LoginPage loginPage;

    @Page
    private BettingPage bettingPage;

    @Page
    private MyAccountPage myAccountPage;

    @Test
    public void LoginTestForMobile() {
        goTo(url);
        bonusPopUp.closeBonusPopUp();
        mainPage.clickLoginButton();
        loginPage.fillLoginform("ta_web_test_de", "B00Xware").clickLogonButton().clickConfirmButton();
        bettingPage.clickMyAccountButton();

        assertThat(myAccountPage.checkLoggedName(), containsString("ta_web_test_de".toUpperCase()));
    }
}
