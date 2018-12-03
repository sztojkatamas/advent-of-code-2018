package hu.advent.of.code.day2;

import hu.advent.of.code.BaseSolution;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;

@Slf4j
public class Day2Solution2 extends BaseSolution {

    int min = 100;
    String minStr = "";

    @Override
    public void run() throws IOException {
        loadDataFromFile("input2.txt");

        data.forEach(s -> {
            data.forEach(c -> diffString(s,c));
        }
        );
        log.info("(Day 2, part 2) Answer: {}", minStr);
    }

    int diffString(String s1, String s2) {
        int diff = 0;
        String a = "";
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if (diff > min) {
                    return diff;
                }
            } else {
                a = a.concat(((Character)s1.charAt(i)).toString());
            }
        }
        if(diff > 0 && diff < min) {
                min = diff;
                minStr = a;
        }
        return diff;
    }
}
