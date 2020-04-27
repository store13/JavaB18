package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    /*
    Arrays.sort(arr): sorts the array in Ascending order
    Arrays.equal()arr1, arr2:   arr1 == arr2
    Arrays.toString(): converts single dimentional array to string
    Arrays.deepToString():converts any multi dimentional array to string
     */

    public static void main(String[] args) {

        int [] arr = {9, 10, 8, 65, 8, 6, 5};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);       // [5, 6, 8, 8, 9, 10, 65]

        System.out.println(Arrays.toString(arr));

        int [] salaries = {1000, 200000, 30, 5000, 432, 123123, 200000 };
        int length = salaries.length;
        int lastIndex = length - 1;

        Arrays.sort(salaries);  // ascending

        System.out.println(Arrays.toString(salaries));  // [30, 432, 1000, 5000, 123123, 200000, 200000]

        System.out.println("Minimum salary: " + salaries[0]); // 30

        System.out.println("Maximum salary: " + salaries[lastIndex]);

        System.out.println("===========================================================");

        int [] arr1 = {3,2,1};
        int [] arr2 = {2,1,3};

        Arrays.sort(arr1);  // {1, 2, 3}
        Arrays.sort(arr2);  // {1, 2, 3}

        System.out.println(Arrays.equals(arr1, arr2));


    }
}
