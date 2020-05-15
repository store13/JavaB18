package Miscellanious.Replit_Questions_And_Answer;

import java.util.Arrays;

public class Replit_Combine_Names {

    public static String[] combineNames(String[] first_names, String[] last_names){
        String [] result = new String[first_names.length];
        for(int i = 0; i< first_names.length; i++){
            result [i] = first_names[i]+" " + last_names[i];
        }
        return result;
    }
    public static void main(String[] args){
        //feel free to test code here
        String [] first_names = {"bob","joe"};
        String [] last_names = {"jones","smith"};

        String [] result = combineNames(first_names, last_names);

        System.out.println(Arrays.toString(result));

    }
}
