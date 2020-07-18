package pl.s13302.data.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class RandomNumberGeneratorTest {

    private RandomNumberDataGenerator randomNumberGenerator;

    @Before
    public void setup() {
        this.randomNumberGenerator = new RandomNumberDataGenerator();
    }

    @Test
    public void getNumber() {
        // Given:

        // When:
        Integer result = this.randomNumberGenerator.getData();

        // Then:
        assertThat(result, notNullValue());
    }
}
