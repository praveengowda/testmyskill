import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TestSumOfEvenNumbersOfFibonacciSeries {

    @Test
    public void sumOfEvenNumbersOfFibonacciSeriesTill(){

        assertEquals(368987, new SumOfEvenNumbersOfFibonacciSeriesFrom(0,1s).sumOfEvenNumbersOfFibonacciSeriesTill(4000000));
        
    }
}
