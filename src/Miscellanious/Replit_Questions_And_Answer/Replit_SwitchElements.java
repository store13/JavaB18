package Miscellanious.Replit_Questions_And_Answer;

import java.util.Arrays;

public class Replit_SwitchElements {

    public static int[] do_switch(int[] i) {

        // Saban's solution ( works in IntelliJ, not work in Replit)

//        int[] result = new int[i.length];
//
//        int k = 0;
//        for (int each : i) {
//            result[k] = each;
//            k++;
//        }
////        result[i.length - 1] = i[0];
////        result[0] = i[i.length - 1];
//        return result;

        // my solution (Same , does not work here, CHECK it out later , works in Replit.

        int[] result = new int[i.length];

        result[0] = i[i.length - 1];
        result[result.length - 1] = i[0];

        for (int j = 0; j < i.length; j++) {
            result[j] = i[j];
        }
        return  result;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int result[] = do_switch(arr);
        System.out.println(Arrays.toString(result)); // [1, 2, 3, 4] olmasi gereken [ 4, 2, 3, 1]
    }
}






