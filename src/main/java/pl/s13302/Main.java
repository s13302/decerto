package pl.s13302;

import pl.s13302.config.Configuration;
import pl.s13302.data.strategy.IGetDataStrategy;
import pl.s13302.data.strategy.RestNumberGenerator;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Configuration configuration = new Configuration();
        IGetDataStrategy<Integer> getDataStrategy = new RestNumberGenerator(configuration);
        Integer number = getDataStrategy.getData();
        System.out.println(number);
    }

}
