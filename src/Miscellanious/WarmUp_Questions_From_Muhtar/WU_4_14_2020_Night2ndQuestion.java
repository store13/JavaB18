package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.util.Arrays;

public class WU_4_14_2020_Night2ndQuestion {
    /*
    2.  Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3

     */
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3};


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 1){
                System.out.println(arr[i]);
          }

        }


        // Zuleyha's Solution

//        for (int each : arr) {
//            int count = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (each == arr[i]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(each);
//            }

        }
    }

