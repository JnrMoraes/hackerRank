package salesByMatch;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the sockMerchant function below.
     public int sockMerchant(int[] ar) {

        Arrays.sort(ar); // to sort the values

        int current = ar[0]; // to be able to compare the values of array
        int count = 1; // to count the pair
        int pair = 0; // counter the pairs

        for(int i = 1; i < ar.length ; i++){
            if(ar[i] == current){
                count++;
                if(count == 2){
                    pair ++;
                    count = count - 2;

                }
            } else {
                current = ar[i];
                count = 1;
            }

        }
        return pair;
    }

}
