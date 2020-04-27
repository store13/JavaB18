package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    /*
    ask the user to enter yes or no.
    if the user enters other than yes or no, repeat the previous step
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter YEs or No");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");

        while (!valid) {     // while the input is NOT yes or no, repeats the question
            System.out.println("please re-enter");
            word = input.next();

            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")) {
                break;
            }

            // WE DON'T NEED ANYMORE BELOW Statements
//            if (word.equalsIgnoreCase("yes")) {
//                System.out.println("Entered Yes");
//            }
//
//            if (word.equalsIgnoreCase("no")) {
//                System.out.println("Entered No");
//            }

        }

    }
}
