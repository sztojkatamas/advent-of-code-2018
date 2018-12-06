package hu.advent.of.code;

import com.google.common.io.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseSolution {
    protected ArrayList<String> data;

    protected abstract void run() throws IOException;

    protected void loadDataFromFile(String filename) throws IOException {
        data = new ArrayList<>();
        InputStream inputStream = Resources.getResource(filename).openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try (Scanner scanner = new Scanner(bufferedReader)) {
            while (scanner.hasNext()) {
                data.add(scanner.nextLine());
            }
        }
    }

}
