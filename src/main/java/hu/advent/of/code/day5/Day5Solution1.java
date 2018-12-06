package hu.advent.of.code.day5;

import hu.advent.of.code.BaseSolution;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class Day5Solution1  extends BaseSolution {

    @Override
    public void run() throws IOException {
        loadDataFromFile("input5.txt");
        log.info("(Day 5, part 1) Answer: {}", polimerize(data.get(0)).length());
    }

    String polimerize(String polimer) {
        int length = polimer.length();
        String shortPolimer = "";
        int i = 0;
        while(i<length-1) {
            char x1 = polimer.charAt(i);
            char x2 = polimer.charAt(i+1);
            if(Math.abs((int)x1 - (int)x2) != 32)
            {
                shortPolimer = shortPolimer.concat(String.valueOf(x1));
                i++;
                if(i==length-1)
                {
                    shortPolimer = shortPolimer.concat(String.valueOf(x2));
                }
            }
            else
            {
                i+=2;
            }
        }

        if(length == shortPolimer.length())
        {
            return polimer;
        }
        return polimerize(shortPolimer);
    }
}




