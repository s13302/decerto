package pl.s13302.numbers.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class RandomNumberGeneratorTest {

    private RandomNumberGenerator randomNumberGenerator;

    @Before
    public void setup() {
        this.randomNumberGenerator = new RandomNumberGenerator();
    }

    @Test
    public void getNumber() {
        // Given:
        int from = 20;
        int to = 50;

        // When:
        Integer result = this.randomNumberGenerator.getNumber(from, to);

        // Then:
        assertThat(result, allOf(
                notNullValue()
                , greaterThanOrEqualTo(from)
                , lessThan(to)
        ));
    }
}
