package day16_ForLoop;

import java.util.Scanner;

public class Scanner_Practice {
    /*
    write a program that asks user to enter num1 and num2,
    and then prints the sum
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        byte num1 = input.nextByte();

        System.out.println("Enter your second number");
        byte num2 = input.nextByte();

        System.out.println("Enter your third number");
        short num3 = input.nextShort();

        System.out.println("Enter your forth number");
        short num4 = input.nextShort();

        int total  = num1 + num2;
        int total2 = num3 + num4;

        System.out.println("The sum of those two numbers are: " + total);
        System.out.println("The sum of those two numbers are: " + total2);


    }


}
