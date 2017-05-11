package com.taplayground.fluentlennium.utils;

public enum UrlProvider {

    SPORTSBOOK_COM("https://mobile-%s-de.tipdev.com/?classicView=true");

    private static final String ENVIRONMENT = "staging";

    private final String baseUrl;

    UrlProvider(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getUrl() {
        return String.format(baseUrl, ENVIRONMENT);
    }
}