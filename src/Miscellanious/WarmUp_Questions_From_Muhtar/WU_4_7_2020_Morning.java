package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.util.Scanner;

public class WU_4_7_2020_Morning {
    /*
    warmup tasks:
	1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
	2. write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
     */
    public static void main(String[] args) {
        // 1
        // it solved at the class by Muhtar, later try to solve here





        //2
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();

        int factorial = 1;

        while (number > 0){
            factorial *= number;
            number--;
        }
        System.out.println(factorial);


    }
}
