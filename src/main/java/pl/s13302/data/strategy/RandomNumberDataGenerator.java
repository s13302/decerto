package pl.s13302.data.strategy;

import java.util.Random;

public class RandomNumberDataGenerator implements IGetDataStrategy<Integer> {

    private Random random;

    public RandomNumberDataGenerator() {
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public Integer getData() {
        return this.random.nextInt();
    }

}
