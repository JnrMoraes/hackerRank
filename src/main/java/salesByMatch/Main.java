package salesByMatch;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Solution solution = new Solution();

        int [] array = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};

//        int [] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(solution.sockMerchant(array));

    }
}

