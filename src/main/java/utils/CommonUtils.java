package utils;

import java.util.Map;
import java.util.Properties;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CommonUtils {

    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);
    private static final Properties ENV_PROPERTIES = SystemEnvironmentVariables.createEnvironmentVariables().getProperties();
    private static Map<String, Object> POS_PROPERTIES;

    public static String getEnvProperty(String propertyName) {
        return ENV_PROPERTIES.getProperty(propertyName);
    }

    public static boolean isStringNull(String string) {
        return string == null || string.isEmpty()
                || "".equals(string.trim());
    }

    public static String getBaseUrl() {
       /* Put in you code to get the base url */
        return "your return url";
    }




}

