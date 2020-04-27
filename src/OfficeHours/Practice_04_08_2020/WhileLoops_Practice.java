package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {

    public static void main(String[] args) {
        /*
        while(Condition){
                statements
        }
        repeated if statement
         */

        for (int i = 0; i <= 5; i++){
            System.out.println("Hello World");
        }

        System.out.println("=====================");

        int z = 0;
        while(z < 5){
            // z++;
            System.out.println("Hello Cybertek");
            z++;
        }

        System.out.println("========================");

        int j = 0;
        while (j <=100){
            if (j % 3 == 0 && j % 5 == 0){ // or j % 15 == 0) (Muhtar did like this)
                System.out.println(j);
            }
            j++;
        }

    }
}
