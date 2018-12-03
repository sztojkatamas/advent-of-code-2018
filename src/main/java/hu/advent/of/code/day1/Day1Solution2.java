package hu.advent.of.code.day1;

import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

import hu.advent.of.code.BaseSolution;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Day1Solution2 extends BaseSolution {

    private int sum = 0;
    private final SortedSet freq = new TreeSet();
    private boolean found = false;

    @Override
    public void run() throws IOException {
        loadDataFromFile("input1.txt");
        while (!found) {
            parseFile();
        }
    }

    private void add(int numberToAdd) {
        sum += numberToAdd;
    }

    private void parseFile() {
        data.forEach(
                s -> {
                    if(!found) {
                        int sign;
                        if (s.charAt(0) == '+') {
                            sign = 1;
                        } else {
                            sign = -1;
                        }
                        add(Integer.parseInt(s.substring(1)) * sign);
                        if (!freq.add(sum)) {
                            log.info("(Day 1, part 2) Answer: {}", sum);
                            found = true;
                        }
                    }
                }
        );
    }
}
