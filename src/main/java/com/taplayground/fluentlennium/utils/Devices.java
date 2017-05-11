package com.taplayground.fluentlennium.utils;

public enum Devices {

    GOOGLE_NEXUS_5("Google Nexus 5"),
    SAMSUNG_GALAXY_S4("Samsung Galaxy S4"),
    SAMSUNG_GALAXY_NOTE_3("Samsung Galaxy Note 3"),
    SAMSUNG_GALAXY_NOTE_2("Samsung Galaxy Note II"),
    APPLE_IPHONE_4("Apple iPhone 4"),
    APPLE_IPHONE_5("Apple iPhone 5"),
    GOOGLE_IPAD_3("Apple iPad 3 / 4");


    private final String deviceName;

    Devices(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return String.format(deviceName);
    }
}
