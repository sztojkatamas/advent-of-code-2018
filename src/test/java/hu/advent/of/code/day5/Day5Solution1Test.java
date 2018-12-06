package hu.advent.of.code.day5;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Day5Solution1Test {

    @Test
    public void testPolimerize() {
        Day5Solution1 testClass = new Day5Solution1();
        Assert.assertEquals(testClass.polimerize("dabAcCaCBAcCcaDA"),  "dabCBAcaDA");
    }
}