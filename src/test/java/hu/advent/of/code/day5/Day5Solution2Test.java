package hu.advent.of.code.day5;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Day5Solution2Test {

    @Test
    public void testStripPolimer() {
        Day5Solution2 testClass = new Day5Solution2();
        Assert.assertEquals(testClass.stripPolimer("A","dabAcCaCBAcCcaDA"), "dbcCCBcCcD");
        Assert.assertEquals(testClass.stripPolimer("B","dabAcCaCBAcCcaDA"), "daAcCaCAcCcaDA");
        Assert.assertEquals(testClass.stripPolimer("C","dabAcCaCBAcCcaDA"), "dabAaBAaDA");
        Assert.assertEquals(testClass.stripPolimer("D","dabAcCaCBAcCcaDA"), "abAcCaCBAcCcaA");

    }
}