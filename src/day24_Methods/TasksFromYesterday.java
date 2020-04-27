package day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {
     /*
    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

     public static void  MaxNumber (int [] array){
         Arrays.sort(array);    // ascending order
         System.out.println("Maximum number is: " + array[array.length -1]);
     }

     public static void MinNumber (int [] array){
         Arrays.sort(array);    // ascending order
         System.out.println("Minimum number is: " + array[0]);
     }

     public static void Descending (int [] array){
         Arrays.sort(array);

         for (int i = array.length -1; i >= 0; i--){
             System.out.print(array[i] + " ");
         }

     }

    public static void main(String[] args) {
        int arr []=  {10,8,9,4,7,0,5,1};
        // MaxNumber(10) : // 10, if parameter is Array, the argument MUST be array
        MaxNumber(arr);
        MinNumber(arr);

        int [] arr2 = {100, 20, 30, 40, -100};
        MaxNumber(arr2);
        MinNumber(arr2);

        int [] arr3 = {23, 76, 9, 100, 5, 2, 8, -43};
        Descending(arr3);

    }
}
