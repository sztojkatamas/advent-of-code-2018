package hu.advent.of.code.day2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import hu.advent.of.code.BaseSolution;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Day2Solution1 extends BaseSolution {

    private int twos = 0;
    private int threes = 0;

    @Override
    public void run() throws IOException {
        loadDataFromFile("input2.txt");
        data.forEach(s -> {
                    twos += checkString(s, 2);
                    threes += checkString(s, 3);}
        );
        log.info("(Day 2, part 1) Answer: {}", twos * threes);
    }

    int checkString(String s, int freq) {
        Map map = new HashMap<Integer, Integer>();

        for (int i=0; i< s.length(); i++) {

            Integer key = Integer.valueOf(Character.getNumericValue(s.charAt(i)));
            Integer value = (Integer) map.get(key);
            if (value != null) {
                map.put(key, ++value);
            } else {
                map.put(key, 1);
            }
        }
        if(map.containsValue(Integer.valueOf(freq))) {
            return 1;
        }
        return 0;
    }
}
