package config;

import org.aeonbits.owner.ConfigFactory;

public class WebConfigHelper {
    public static String getBrowserStackUser() {
        return getWebConfig().webUser();
    }

    public static String getBrowserStackKey() {
        return getWebConfig().webKey();
    }

    public static String getBrowserStackKeyUrl() {
        return getWebConfig().webUrl();
    }

    private static WebConfig getWebConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
}
