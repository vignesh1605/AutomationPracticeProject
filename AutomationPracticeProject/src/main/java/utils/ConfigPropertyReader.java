package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertyReader {

    public static String getConfigPropertyValues(String propertyKey){

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File("src/main/resources/configuration/configuration.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties = new Properties();
        String propertyKeyValue;
        try {
            properties.load(fileInputStream);
            propertyKeyValue = properties.getProperty(propertyKey);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return propertyKeyValue;
    }

}
