package by.itClass.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private Properties properties;

    public PropertiesUtil(String filename) {
        properties = new Properties();
        try {
            properties.load(new FileReader(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}
