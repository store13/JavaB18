package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEach_Loop {

    public static void main(String[] args) {

        /*
        for each loop: loop that's already been iterated !!

            for(DataType variableName: ArrayName ){

            }
            variable name represents each of the data in the array
            DataType MUST be matched with Array's data type
            number of execution times of the loop depends on the size of the Array

            When do we use it: first we MUST have a data structure
                               whenever we don't need to provide the index numbers (JUST)

         */
        int[] nums = {1, 2, 3, 4};

        for (int eachElement : nums) {
            System.out.println(eachElement);
        }

        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for (String eachStudent : students) {
            System.out.println(eachStudent);
        }

        int[] arr1 = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        Arrays.sort(arr1);  // [1,2,3,4,5,6,7,8,9,10]

        for (int each : arr1) {
            if (each < 5) {
                continue;
            }
            System.out.println(each);
        }

        System.out.println("==============================");

        String sentence = "I like Java";       // Java like I , no chance to use FOR EACH Loop

        String[] words = sentence.split(" ");   // [I, like, Java]

//        for( String eachWord : words){  // 0 ~ 2
//            System.out.println(eachWord);
//        }
        System.out.println("==============================");

        for (int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]);
        }


    }
}
