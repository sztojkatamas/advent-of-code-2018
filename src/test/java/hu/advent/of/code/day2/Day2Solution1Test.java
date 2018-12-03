package hu.advent.of.code.day2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class Day2Solution1Test {

    @Test
    public void testCheckString() {
        Day2Solution1 testClass = new Day2Solution1();
        assertEquals(testClass.checkString("abcdedfgh",2), 1);
        assertEquals(testClass.checkString("abcdedfgd",3), 1);

        assertEquals(testClass.checkString("abcccd",2), 0);
        assertEquals(testClass.checkString("abcccd",3), 1);

        assertEquals(testClass.checkString("aabcdd",2), 1);
    }

}