package com.taplayground.fluentlennium.utils;

public enum UrlProvider {

    DEV_ADMIN_CENTRAL("http://api-frontend-1.api-frontend.%s.tipdev.com:%d/magnoliaAuthor/.magnolia/admincentral"),
    DEV_CASINO("https://web-%s.tipdev.com/en/online-casino/v2"),
    DEV_LIVE_CASINO("https://web-%s.tipdev.com/en/online-casino/v2/live-casino/"),
    DEV_AUTHOR("http://api-frontend-1.api-frontend.%s.tipdev.com:%d/magnoliaAuthor/casino.com/en/online-casino/v2/"),
    SPORTSBOOK_COM("https://web-%s.tipdev.com/en/online-sports-betting/");

    private final String baseUrl;

    UrlProvider(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getUrl() {
        return String.format(baseUrl);
    }
}gi