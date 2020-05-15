package Miscellanious.Replit_Questions_And_Answer;

import java.util.ArrayList;
import java.util.Arrays;

public class swap {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        String str1 = list.get(pos1);
        String str2 = list.get(pos2);

        list.set(pos2, str1);
        list.set(pos1, str2);

        return list;

    }

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>(Arrays.asList("a"," b", "c", "d" , "e" ,"f"));


        System.out.println(swap(list, 0, 2));


    }//end main
}

