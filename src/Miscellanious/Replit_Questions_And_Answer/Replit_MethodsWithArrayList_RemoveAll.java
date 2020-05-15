package Miscellanious.Replit_Questions_And_Answer;

//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsWithArrayList_RemoveAll {

    public static void main(String[] args) {
       //create your method below
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hi","hi","hi"));
        String targetWord = "hi";
        removeAll(wordList, targetWord);
    }
    public static void removeAll(ArrayList<String> wordList, String targetWord) {

        // 1st way (contains & remove)
//        for (int i = 0; i < wordList.size(); i++){
//            if(wordList.contains(targetWord)){
//                wordList.remove(targetWord);
//                i--;  // do NOT forget to add in order to not count again targetWord
//            }
//        }
        //2nd  way(get & remove)
        for (int i=0; i <wordList.size(); i++){
            if (wordList.get(i).equals(targetWord)){
                wordList.remove(wordList.get(i));
                i--;    // do NOT forget to add in order to not count again targetWord
            }
        }
//        //3 rd way (removeALL)
//        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);

    }

    }

