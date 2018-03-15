import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SumOfSquareDifferenceTest {

    @Test
    public void shouldReturn2640() {

        // given
        SumOfSquareDifference sumOfSquareDifference = new SumOfSquareDifference();
        int firstNumbersOfNaturalNumbers = 10;

        // when
        int result = sumOfSquareDifference.sumOfSquareDifference(firstNumbersOfNaturalNumbers);

        // then
        Assert.assertThat(result, CoreMatchers.is(2640));
    }

    @Test
    public void shouldReturn1582700() {

        // given
        SumOfSquareDifference sumOfSquareDifference = new SumOfSquareDifference();
        int firstNumbersOfNaturalNumbers = 50;

        // when
        int result = sumOfSquareDifference.sumOfSquareDifference(firstNumbersOfNaturalNumbers);

        // then
        Assert.assertThat(result, CoreMatchers.is(1582700));
    }

    @Test
    public void shouldReturn25164150() {

        // given
        SumOfSquareDifference sumOfSquareDifference = new SumOfSquareDifference();
        int firstNumbersOfNaturalNumbers = 100;

        // when
        int result = sumOfSquareDifference.sumOfSquareDifference(firstNumbersOfNaturalNumbers);

        // then
        Assert.assertThat(result, CoreMatchers.is(25164150));
    }
}
