package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.util.*;

public class WU_4_1_2020_Array {
    /*
    Warmup tasks:
    1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
     */
    public static void main(String[] args) {

        int[] arr = {23, -43, 76, 123, 90, 345};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);

    }
}

