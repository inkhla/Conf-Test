package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public static Properties getConfigProperties() throws IOException {
        FileReader reader = new FileReader("src\\\\test\\\\resources\\\\config\\\\config.properties");

        Properties properties = new Properties();
        properties.load(reader);

        return properties;
    }
}
