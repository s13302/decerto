package pl.s13302.data.strategy;

import pl.s13302.config.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestNumberGenerator implements IGetDataStrategy<Integer> {

    private final Configuration configuration;

    public RestNumberGenerator(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Integer getData() {
        HttpURLConnection connection = null;
        Integer result = null;
        try {
            URL url = new URL(getUrl());
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int status = connection.getResponseCode();
            if (status != 200) {
                throw new RuntimeException("Connection to " + getUrl() + " was broken, returned status code: " + status);
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            result = Integer.parseInt(reader.readLine());
            connection.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return result;
    }

    private String getUrl() {
        String minNumber = configuration.getPropertyValue(Configuration.PROP_REST_MIN_NUMBER);
        String maxNumber = configuration.getPropertyValue(Configuration.PROP_REST_MAX_NUMBER);
        return String.format(configuration.getPropertyValue(Configuration.PROP_REST_TEMPLATE_URL), minNumber, maxNumber);
    }

}
