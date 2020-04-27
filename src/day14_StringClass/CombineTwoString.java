package day14_StringClass;

import java.util.Scanner;

public class CombineTwoString {
     /*
    Warmup tasks:
	1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
     */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter first word");
         String word1 = input.next(); // just we ask one word, we don't need to use nextLine()

         System.out.println("Enter second word");
         String word2 = input.next();

         String result = word1.concat(" " + word2).concat(" " + word2).concat(" " + word1);
         System.out.println(result);




     }


}
