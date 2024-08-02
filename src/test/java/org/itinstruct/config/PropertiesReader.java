package org.itinstruct.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    String filePath = "config/config.properties";
    Properties properties;
    public PropertiesReader() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        this.properties = new Properties();
        this.properties.load(fileInputStream);
    }
    public String getPropertyData(String key) {
        return this.properties.getProperty(key);
    }
}
