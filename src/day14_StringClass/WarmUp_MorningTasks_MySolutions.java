package day14_StringClass;

import java.util.Scanner;

public class WarmUp_MorningTasks_MySolutions {
    /*
    Warmup tasks:
	1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
	2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
	3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first word");
        String firstword = input.nextLine();
        System.out.println("Please enter your second word");
        String secondword = input.nextLine();

        String result = firstword.concat(secondword).concat(secondword).concat(firstword);
        System.out.println(result);

        String word1 = firstword.substring(1);
        String word2 = secondword.substring(1);

        String result2 = word1.concat(word2);
        System.out.println(result2);

        //  3rd question
        System.out.println("Enter your word");
        String word = input.nextLine();

        //if (word.length() %2 = 0){
        String item="elephant";
        System.out.println(item.length());
        if(item.length()%2==0){
            System.out.println((item.substring((item.length()/2)-1,item.length()/2+1)));
        }
        else{
            System.out.println(item.charAt(item.length()/2+1));
        }

    }



}
