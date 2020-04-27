package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {
    // write a return method that can return the 2nd max number from an int array

    public static void main(String[] args) {

        int [] arr = {100, 40, 500, 50, 30, 400, -5, -100};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int lastIndexNum = arr.length - 1;
        int secondIndexNum = lastIndexNum - 1;  // arr.length - 2

        int secondMaximum = arr[secondIndexNum];

        System.out.println(secondMaximum);

        int [] arr2 = {1, 2, 3, 4 ,5, 6, 7, 8};

        int num2 = SecondMaxNum(arr2);

        System.out.println(num2);


    }

    public static int SecondMaxNum (int [] arr){

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int lastIndexNum = arr.length - 1;
        int secondIndexNum = lastIndexNum - 1;  // arr.length - 2

        int secondMaximum = arr[secondIndexNum];

        return secondMaximum;

    }
}
