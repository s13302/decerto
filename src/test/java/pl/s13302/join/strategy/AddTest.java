package pl.s13302.join.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.s13302.numbers.strategy.GetNumberStrategyStub;
import pl.s13302.numbers.strategy.IGetNumberStrategy;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AddTest {

    private final int getNumberResult = 1;
    private Add add;
    private IGetNumberStrategy getNumberStrategy;

    @Before
    public void setup() {
        this.add = new Add();
        this.getNumberStrategy = new GetNumberStrategyStub(getNumberResult);
    }

    @Test
    public void doJoinDataTest() {
        // Given:

        // When:
        Integer result = add.doJoinData(getNumberStrategy, getNumberStrategy);

        // Then:
        assertThat("Result should be not null and equal to " + (getNumberResult + getNumberResult), result, allOf(
                notNullValue()
                , equalTo(2)
        ));
    }

    @Test(expected = IllegalArgumentException.class)
    public void doJoinDataWhenOneGetNumberStrategyIsNull() {
        // Given:

        // When:
        Integer result = add.doJoinData(getNumberStrategy, null);

        // Then:
        Assert.fail("The exception should be thrown");
    }

}
