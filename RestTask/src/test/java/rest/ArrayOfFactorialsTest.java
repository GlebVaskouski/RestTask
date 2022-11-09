package rest;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class ArrayOfFactorialsTest extends TestCase {

    public void testGetArrayOfZero() {
        ArrayOfFactorials arr = new ArrayOfFactorials(0);
        ArrayList<Integer> expected = arr.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        Assert.assertEquals(expected, test);
    }
    public void testGetArrayOfOne() {
        ArrayOfFactorials arr = new ArrayOfFactorials(1);
        ArrayList<Integer> expected = arr.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        Assert.assertEquals(expected, test);
    }
    public void testGetArrayOfThree() {
        ArrayOfFactorials arr = new ArrayOfFactorials(3);
        ArrayList<Integer> expected = arr.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(6);
        Assert.assertEquals(expected, test);
    }
    public void testGetArrayOfFive() {
        ArrayOfFactorials arr = new ArrayOfFactorials(5);
        ArrayList<Integer> expected = arr.getArray();
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(6);
        test.add(24);
        test.add(120);
        Assert.assertEquals(expected, test);
    }

}