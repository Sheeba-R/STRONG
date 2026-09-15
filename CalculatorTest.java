package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;

        int actual = a + b;
        int expected = 30;

        Assert.assertEquals(actual, expected);

        System.out.println("Addition Test Passed");
    }
}