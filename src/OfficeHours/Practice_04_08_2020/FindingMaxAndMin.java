package OfficeHours.Practice_04_08_2020;

import org.omg.IOP.RMICustomMaxStreamFormat;

import java.util.Scanner;

public class FindingMaxAndMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 214748367;
        int i = 1;
        while(i <= 5){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }
            i++;
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);




    }

}
