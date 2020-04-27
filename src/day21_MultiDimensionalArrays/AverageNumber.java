package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    /*
    warmup tasks:
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10

     */
    public static void main(String[] args) {

        DecimalFormat DF = new DecimalFormat("0.00");

        int [] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        // average : sim of all numbers / length

        int length = arr.length;     // total number of the elements
        int sum = 0;

        for (int i =0; i < length; i++){
            int eachNum = arr[i];
            sum += eachNum;
        }
        System.out.println(sum);

        double average = sum / (double) length; // it is a good way just with one line code to reach DECIMAL number :)

        System.out.println(average);
        System.out.println(DF.format(average));
    }
}
