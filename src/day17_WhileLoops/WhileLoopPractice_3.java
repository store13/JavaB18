package day17_WhileLoops;

public class WhileLoopPractice_3 {

    public static void main(String[] args) {
    /*
        for (int i = 1; i <= 100; i++){
            System.out.println("*");
        }
     */
        int i = 1;
        while (i <= 100) {
            System.out.println("*" + i);
            i++;
        }
        System.out.println();

        // Rectangle Question

        int number = 3; // or number= 0, while (number < 3) we changed the loop like this
        /*
         ***
         * *
         * *
         ***
         */

        System.out.println("***");
        while (number > 0) {
            System.out.println("* *");
            number--;
        }
        System.out.println("***");
    }
}