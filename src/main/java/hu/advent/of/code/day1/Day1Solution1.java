package hu.advent.of.code.day1;

import java.io.IOException;
import hu.advent.of.code.BaseSolution;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Day1Solution1 extends BaseSolution {

    private int sum = 0;

    @Override
    public void run() throws IOException {

        loadDataFromFile("input1.txt");
        data.forEach(s -> { int sign = 1;
            if (s.charAt(0) == '-') { sign = -1; }
            add(Integer.parseInt(s.substring(1)) * sign);
        });
        log.info("(Day 1, part 1) Answer: {}", sum);
    }

    private void add(int numberToAdd) {
        sum += numberToAdd;
    }
}
