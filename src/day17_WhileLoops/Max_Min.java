package day17_WhileLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Max_Min {
    /*
    Warmup tasks:
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will need for loop and if statement

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxNumber = -999999999; // any number the user provided will be greater than this number
                                    // first user entered variable will be initialized to MaxNumber

        int MinNumber = 999999999;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > maxNumber) { // to compare each user inputs, and assign the maximum number to MaxNumber
                maxNumber = num;
            }

            if (num < MinNumber){
                MinNumber = num;
            }
        }
        System.out.println("Max Number is: " + maxNumber);
        System.out.println("Min Number is: " + MinNumber);

    }

}
