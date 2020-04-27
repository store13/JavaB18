package Miscellanious.Replit_Questions_And_Answer;

import java.util.*;

public class Replit_167 {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (!result.contains("" + str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;


    }
}

