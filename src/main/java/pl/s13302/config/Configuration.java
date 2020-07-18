package pl.s13302.config;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Properties;

public class Configuration {

    private static final String FILE_NAME = "application.properties";

    public static final String PROP_REST_TEMPLATE_URL = "REST.TEMPLATE_URL";
    public static final String PROP_REST_MIN_NUMBER = "REST.MIN_NUMBER";
    public static final String PROP_REST_MAX_NUMBER = "REST.MAX_NUMBER";

    private Properties properties;

    public Configuration() throws IOException, URISyntaxException {
        properties = new Properties();

        File propertiesFile = Paths.get(getClass().getClassLoader().getResource(FILE_NAME).toURI()).toFile();

        properties.load(new FileReader(propertiesFile));
    }

    public String getPropertyValue(String propertyKey) {
        return properties.getProperty(propertyKey);
    }

}
