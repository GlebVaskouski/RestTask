package rest;

import junit.framework.TestCase;
import org.junit.Assert;

public class FactorialTest extends TestCase {

    public void testGetFactorialOfZero() {
        Factorial fact = new Factorial(0);
        int expected = fact.getFactorial();
        Assert.assertEquals(expected, 1);
    }
    public void testGetFactorialOfOne() {
        Factorial fact = new Factorial(1);
        int expected = fact.getFactorial();
        Assert.assertEquals(expected, 1);
    }
    public void testGetFactorialOfTwo() {
        Factorial fact = new Factorial(2);
        int expected = fact.getFactorial();
        Assert.assertEquals(expected, 2);
    }
    public void testGetFactorialOfFive() {
        Factorial fact = new Factorial(5);
        int expected = fact.getFactorial();
        Assert.assertEquals(expected, 120);
    }
    public void testGetFactorialOfSeven() {
        Factorial fact = new Factorial(7);
        int expected = fact.getFactorial();
        Assert.assertEquals(expected, 5040);
    }
}