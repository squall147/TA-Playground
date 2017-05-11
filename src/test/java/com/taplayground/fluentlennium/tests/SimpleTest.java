package com.taplayground.fluentlennium.tests;

import com.taplayground.fluentlennium.utils.UrlProvider;
import org.junit.Test;

public class SimpleTest extends BaseFluentTest{

    private String url = UrlProvider.SPORTSBOOK_COM.getUrl();

    @Test
    public void OpenBrowser() {
        goTo(url);
    }
}
