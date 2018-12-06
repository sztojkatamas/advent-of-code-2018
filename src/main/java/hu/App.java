package hu;

import hu.advent.of.code.day1.Day1Solution1;
import hu.advent.of.code.day1.Day1Solution2;
import hu.advent.of.code.day2.Day2Solution1;
import hu.advent.of.code.day2.Day2Solution2;
import hu.advent.of.code.day3.Day3Solution1;
import hu.advent.of.code.day3.Day3Solution2;

import hu.advent.of.code.day5.Day5Solution1;
import hu.advent.of.code.day5.Day5Solution2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) throws Exception {
        Day1Solution1 day1Solution1 = new Day1Solution1();
        Day1Solution2 day1Solution2 = new Day1Solution2();

        Day2Solution1 day2Solution1 = new Day2Solution1();
        Day2Solution2 day2Solution2 = new Day2Solution2();

        Day3Solution1 day3Solution1 = new Day3Solution1();
        Day3Solution2 day3Solution2 = new Day3Solution2();

        Day5Solution1 day5Solution1 = new Day5Solution1();
        Day5Solution2 day5Solution2 = new Day5Solution2();

        day1Solution1.run();
        day1Solution2.run();

        day2Solution1.run();
        day2Solution2.run();

        day3Solution1.run();
        day3Solution2.run();

        day5Solution1.run();
        day5Solution2.run();
    }
}
