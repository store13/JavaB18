package day12_JavaRecap;

import java.util.Scanner;

/*
Write a program that calculates the sum of maximum of 5 positive numbers entered by the user.
If the user enters negative number or zero, it is skipped from calculation.
 */

public class SumOfFiveNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter five numbers");
//        double num1 = input.nextDouble();
//        double num2 = input.nextDouble();
//        double num3 = input.nextDouble();
//        double num4 = input.nextDouble();
//        double num5 = input.nextDouble();
//
//        double sum = 0;
//
//        if(num1 > 0) {
//            sum += num1;
//        }
//        if(num2 > 0) {
//            sum += num2;
//        }
//        if(num3 > 0) {
//            sum += num3;
//        }
//        if(num4 > 0) {
//            sum += num4;
//        }
//        if(num5 > 0) {
//            sum += num5;
//        }
//
//        System.out.println("sum of the five numbers : " + sum);

        /*
        Assignment :
        Write a program that asks to enter 5 numbers and prints the numbers in ascending order
        Ex: 5, 4, 1, 2, 3
        output : 1, 2, 3, 4, 5
         */
        // Scanner input = new Scanner(System.in); // already it is above
        System.out.println("Enter five numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();


        if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { // a >= b,c,d,e
            System.out.println ("Largest is: " + a);
        } else if ((b >= c) && (b >= d) && (b >= e)) {      // b >= c,d,e
            System.out.println ("Largest is: " + b);
        } else if ((c >= d) && (c >= e)) {                  // c >= d,e
            System.out.println ("Largest is: " + c);
        } else if (d >= e) {                                // d >= e
            System.out.println ("Largest is: " + d);
        } else {                                            // e > d
            System.out.println ("Largest is: " + e);
        }





    }
}
