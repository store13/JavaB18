package day10_Switch_Scanner;

import java.util.Scanner;

public class numbers_Scanner {
    /*
    write a program that asks user to enter 3 numbers ,
    print out the maximum and minimum number
    number scanner
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = input.nextInt();

        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Enter your third number");
        int num3 = input.nextInt();

        int max = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 :num3;

        int min = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 :num3;

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);



    }
}
