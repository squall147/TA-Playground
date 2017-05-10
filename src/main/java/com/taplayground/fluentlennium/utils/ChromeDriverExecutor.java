package com.taplayground.fluentlennium.utils;

import org.apache.commons.lang3.SystemUtils;

public class ChromeDriverExecutor extends DriverExecutor {

    private static final String CHROME_WINDOWS_PATH = "src/main/resources/drivers/windows/chromedriver.exe";
    private static final String CHROME_MACOS_PATH = "";
    private static final String CHROME_LINUX_64_PATH = "";
    private static final String CHROME_LINUX_32_PATH = "";

    public static final String getProperDriverExecutable() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (SystemUtils.IS_OS_MAC) {
            System.out.println("Mac OS X detected, assigning proper executable.");
            return CHROME_MACOS_PATH;
        } else if (SystemUtils.IS_OS_WINDOWS) {
            System.out.println("Windows detected, assigning proper executable.");
            return CHROME_WINDOWS_PATH;
        } else if (osName.contains("linux")) {
            if (System.getProperty("os.arch").indexOf("64") != -1) {
                setFullPermissionsForDriver(CHROME_LINUX_64_PATH);
                return CHROME_LINUX_64_PATH;
            } else {
                setFullPermissionsForDriver(CHROME_LINUX_32_PATH);
                return CHROME_LINUX_32_PATH;
            }
        }
        return null;
    }

}
