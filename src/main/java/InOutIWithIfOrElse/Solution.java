package InOutIWithIfOrElse;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        int upperbound = 100;
        //generate random values from 0-100
        int N = rand.nextInt(upperbound);

        if(N >= 21){
            System.out.print(N + " Not Weird");
        } else if(N <= 20){
            System.out.print(N + " Weird");
        } else if (N <= 5){
            System.out.print(N + " Not Weird");
        } else if (N <= 1){
            System.out.print(N + " Not Weird");
        }
    }
}

//if(N%2==1)
//        System.out.println("Weird");
//        else
//        {
//        if(N>=2&&N<=5)
//        System.out.println("Not Weird");
//        else if(N<=20)
//        System.out.println("Weird");
//        else
//        System.out.println("Not Weird");