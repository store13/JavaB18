package day14_StringClass;

import java.util.Scanner;

public class EndLY {
    /*
    4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();
        word = word.toLowerCase();

        boolean result = word.endsWith("ly");

        if (result){
            System.out.println("really?");
        } else{
            System.out.println("never mind");
        }

    }
}
