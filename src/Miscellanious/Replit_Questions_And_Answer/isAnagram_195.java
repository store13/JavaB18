package Miscellanious.Replit_Questions_And_Answer;

import java.util.Arrays;

public class isAnagram_195 {

    public static boolean isAnagram(String word1, String word2) {

        boolean status = true;

        word1 = word1.replace(" ", "");
        word1 = word1.toLowerCase();

        word2 = word2.replace(" ", "");
        word2 = word2.toLowerCase();

        char[] ArrWord1 = word1.toCharArray();
        char[] ArrWord2 = word2.toCharArray();

        Arrays.sort(ArrWord1);
        Arrays.sort(ArrWord2);

        if (word1.length() != word2.length()) {
            return !status;
        }
//        word1 = word1.replace(" ", "");
//        word1 = word1.toLowerCase();
//
//        word2 = word2.replace(" ", "");
//        word2 = word2.toLowerCase();
//
//        char[] ArrWord1 = word1.toCharArray();
//        char[] ArrWord2 = word2.toCharArray();
//
//        Arrays.sort(ArrWord1);
//        Arrays.sort(ArrWord2);
        else if (Arrays.equals(ArrWord1, ArrWord2)) {
            return status;
        }else{
            return !status;
        }

    }


    public static void main (String [] args){

        String word1 = "LisTen";
        String word2 = "siLENT";

        Boolean result = isAnagram(word1, word2);
        System.out.println (result);
    }
}

