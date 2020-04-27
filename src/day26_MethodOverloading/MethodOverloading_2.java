package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading_2 {
    /*
    !st method: print the sum of two int numbers
    2nd method: print the sum of three int numbers
    3rd method: print the sum of four int numbers
     */


    public static void main(String[] args) {
        // 12, 5
        sum(12, 5);

        // 3, 6, 9
        sum(3,6,9);

        // 1, 5, 8, 55
        sum(1,5,8,55);

        int [] arr1 = {3, 2, 1};
        char [] arr2 = {'z', 's', 'a'};
        double [] arr3 = {7.4, 6, 5, 20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);  // same method name, different parameter

        //System.out.println(Arrays.toString(arr1));

    }

    public static void sum (int a, int b){
        System.out.println(a+b);
    }

    public static void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum (int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

}
