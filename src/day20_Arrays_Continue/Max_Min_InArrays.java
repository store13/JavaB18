package day20_Arrays_Continue;

public class Max_Min_InArrays {
    /*
Warmup tasks:
    1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE
     */
    public static void main(String[] args) {

        int [] arr = {10, 6, 3, 1, 200, 1000};
        int lastIndex = arr.length-1;

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= lastIndex; i++){
            if (arr[i] > max){  // array's index are compared with each other, and whichever is greater will be assigned to the max
                max = arr[i];
            }

            if (arr[i] < max){  // array's index are compared with each other, and whichever is smaller will be assigned to the max
                min = arr[i];
            }

        }

        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);

    }
}
