package Miscellanious.Replit_Questions_And_Answer;

import java.util.ArrayList;

public class CombineTwoArrays_ReturnAString_Replit181 {

    public static void main(String[] args) {

        String [] str1 = {"f", "o", "o"};
        String [] str2 = {"b", "a", "r"};

        String result = combineRs(str1, str2);
        System.out.println(result);

    }

    public static String combineRs(String[] r1,String[] r2) {

        ArrayList<String> arr = new ArrayList<>();

        for (String each : r1){
            arr.add(each);
        }

        for (String each : r2){
            arr.add(each);
        }

        String combine ="";

        for( String each : arr){
            combine += each;
        }

        return combine;

    }

}
