package day15_ForLoop;

import java.util.Scanner;

public class Palindrome_Assignment {

    public static void main(String[] args) {
    /*
    Assignment: Write a program to identify if a string is a palindrome or not.
    if yes ==> true, otherwise --> false
    level ==> level --> palindrome
     */

        Scanner input = new Scanner(System.in);
        System.out.println ("Enter your word");
        String word = input.next();

        String wordReverse = "";

        for ( int i = word.length() -1 ; i >= 0; i--){
            wordReverse += word.charAt(i);
        }

        if (word.equals(wordReverse)){
            System.out.println(word + " is palindrome");
        }else{
            System.out.println(word + " is NOT palindrome");
        }
    }
}
