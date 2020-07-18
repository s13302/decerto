package pl.s13302.numbers.strategy;

import java.util.Random;

public class RandomNumberGenerator implements IGetNumberStrategy {

    private Random random;

    public RandomNumberGenerator() {
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public Integer getNumber(int from, int to) {
        return this.random.nextInt(to - from) + from;
    }

}
