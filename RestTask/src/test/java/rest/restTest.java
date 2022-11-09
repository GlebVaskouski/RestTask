package rest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class restTest {


    @Test
    public void FactorialOfZero() {
        int expected = rest.SolveFactorial(0);
        Assert.assertEquals(expected, 1);
    }
    @Test
    public void FactorialOfOne() {
        int expected = rest.SolveFactorial(1);
        Assert.assertEquals(expected, 1);
    }
    @Test
    public void FactorialOfTwo() {
        int expected = rest.SolveFactorial(2);
        Assert.assertEquals(expected, 2);
    }
    @Test
    public void FactorialOfFour() {
        int expected = rest.SolveFactorial(4);
        Assert.assertEquals(expected, 24);
    }
    @Test
    public void FactorialOfSeven() {
        int expected = rest.SolveFactorial(7);
        Assert.assertEquals(expected, 5040);
    }
    @Test
    public void FactorialOfTen() {
        int expected = rest.SolveFactorial(10);
        Assert.assertEquals(expected, 3628800);
    }

    @Test
    public void ArrayOfZero() {
        ArrayList<Integer> expected = rest.SolveArray(0);
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void ArrayOfOne() {
        ArrayList<Integer> expected = rest.SolveArray(1);
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void ArrayOfThree() {
        ArrayList<Integer> expected = rest.SolveArray(3);
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(6);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void ArrayOfFive() {
        ArrayList<Integer> expected = rest.SolveArray(5);
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(6);
        test.add(24);
        test.add(120);
        Assert.assertEquals(expected, test);
    }

}