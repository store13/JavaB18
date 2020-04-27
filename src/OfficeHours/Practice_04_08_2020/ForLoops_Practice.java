package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {

    public static void main(String[] args) {
        /*
        for (initialization; Condition; iterator){

        }

        iterator : co-related to your condition

        execution order:
        1. initialization
        2. condition
                if true:
                    statements in the body
                    then Iterator

                if false:
                stops loop
         */

        for (int i = 0;  i <= 5; i+=2){         // i++ : 0,1,2,3,4,5
                                                // i+=2: 0, 2, 4
            System.out.println("Hello World " + i);
        }

        System.out.println("==============================");

        for (int i = 1;  i <= 5;){
            // i++;
            System.out.println(i); // 2, 3, 4, 5, 6
            i++;                   // 1 2 3 4 5
        }



    }
}
