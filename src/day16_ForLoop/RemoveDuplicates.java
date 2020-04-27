package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    /*
    task:
    write a program that can remove duplicated characters from a string
     */
    public static void main(String[] args) {
        //String str = "abab";
        //            0123
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();
        String result = ""; // ab (for the above string example)

        for (int i = 0; i <= word.length() -1; i++){
           /*
            if( !result.contains("" + word.charAt(i))){
                result += word.charAt(i);
            }
            */
           if (result.contains("" + word.charAt(i))){ // convert Char to String, we should add "" ...
               continue;
           }
           result += word.charAt(i);
        }
        System.out.println(result);
    }
}
