package countingValleys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Result result = new Result();

        int steps = 8;
        String path = "UDDDUDUU";
//        String[] array = {"U", "D", "D", "D", "U", "D", "U", "U"};
//        String arrayString = (Sarray;

        System.out.println(result.countingValleys(steps, path));

    }
}
