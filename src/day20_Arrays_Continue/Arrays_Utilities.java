package day20_Arrays_Continue;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Arrays_Utilities {

    public static void main(String[] args) {

        // Arrays.toString(arrayName): converts the array to String, returns the string

        int [] arr = {1,2,3};

        String r = Arrays.toString(arr);
        System.out.println(r);

        System.out.println(arr); // Array MUST be converted to string before we print

        String names [] = {"Madina", "Fatih", "Osman"};

        System.out.println(Arrays.toString(names));

        double [] nums = {10,20,30};

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + 1);    // 11.0
        /*
        practice task:
        write a program that can combine two arrays of any lengths, and return the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7]

        arr3 ==> [1,2,3,4,5,6,7]
         */

        int arr1 [] = {1,2,3};
        int arr2 [] = {4,5,6,7};

        int arr3 [] = new int[arr1.length + arr2.length]; // can contain all the elements from arr1 and arr2

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];      // {1, 2, 3, 0, 0, 0, 0}
        }

        for (int i = 0; i < arr2.length; i++){
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        // Arrays.sort(arrayName) : sort the given array in ascending order
        //      int[] arr = {8, 5,



    }
}
