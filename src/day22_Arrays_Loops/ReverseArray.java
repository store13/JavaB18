package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    /*
    warmup tasks:
    1. write a program that can reverse the array
    2. write a program that sort the array in descending order
    3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //           0  1  2  3  4 .....

        for(int i = arr.length -1 ; i >= 0; i--  ){
            int eachNum = arr[i];
            System.out.println(eachNum);
        }

        System.out.println("===================================");
        //[5, 4, 3, 2, 1]
        int[] RevArr = new int[arr.length]; // [0, 0, 0, 0, 0]

/*
        //     i        j
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];
*/
        int j = arr.length -1; //4
        for(int i = 0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        System.out.println(Arrays.toString(RevArr));

    }
}
