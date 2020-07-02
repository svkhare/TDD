import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testEmptyString()
    {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testOneNumber()
    {
        assertEquals(1, Calculator.add("1"));
        assertEquals(2, Calculator.add("2"));
        assertEquals(999, Calculator.add("999"));
    }

    @Test
    public void testMultipleNumbers()
    {
        assertEquals(5, Calculator.add("2 3"));
        assertEquals(10, Calculator.add("9 1"));
    }

    @Test
    public void testEmptyStringMul()
    {
        assertEquals(1, Calculator.mul(""));
    }

    @Test
    public void testOneNumberMul()
    {
        assertEquals(1, Calculator.mul("1"));
        assertEquals(2, Calculator.mul("2"));
        assertEquals(999, Calculator.mul("999"));
    }

    @Test
    public void testMultipleNumbersMul()
    {
        assertEquals(6, Calculator.mul("2 3"));
        assertEquals(60, Calculator.mul("2 3 2 5"));
    }
}
