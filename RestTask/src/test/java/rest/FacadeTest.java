package rest;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class FacadeTest extends TestCase {

    public void testGetFacadeOfZero() {
        Facade fac = new Facade(0);
        int expectedNumber = fac.getFactorial();
        ArrayList<Integer> expectedArray = fac.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        Assert.assertEquals(expectedNumber, 1);
        Assert.assertEquals(expectedArray, test);
    }
    public void testGetFacadeOfOne() {
        Facade fac = new Facade(1);
        int expectedNumber = fac.getFactorial();
        ArrayList<Integer> expectedArray = fac.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        Assert.assertEquals(expectedNumber, 1);
        Assert.assertEquals(expectedArray, test);
    }
    public void testGetFacadeOfFive() {
        Facade fac = new Facade(5);
        int expectedNumber = fac.getFactorial();
        ArrayList<Integer> expectedArray = fac.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(6);
        test.add(24);
        test.add(120);
        Assert.assertEquals(expectedNumber, 120);
        Assert.assertEquals(expectedArray, test);
    }
}