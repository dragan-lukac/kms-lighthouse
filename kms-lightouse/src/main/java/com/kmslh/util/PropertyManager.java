package com.kmslh.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static String url;

    public String getUrl() {
        return url;
    }


    private static PropertyManager instance;

    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
            instance.loadData();
        }
        System.out.println(instance);
        return instance;
    }

    private void loadData() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        url = properties.getProperty("url");
    }
}
