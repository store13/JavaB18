package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        // initializing the size of array :
        //      1. giving the values: size will be initialized automatically
        //          int [] arr = {10, 20, 30}

        //      2. giving the size only: default value of te datatype will be assigned at each index
        //          int [] arr = new int[length];

        //      default values:
        //              byte, short, int , long ==> 0
        //              String or any other object ==> NULL


        // length: returns length of array

        int [] arr = {10, 20, 30};
        System.out.println(arr.length); // 3

        int [] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String [] Testers = new String[3]; //{"Reem", "Madina", "Osman"};
                // index : 0 1 2
        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Medina";

        System.out.println(Testers[0]); // Reem
        System.out.println(Testers[1]); // NULL --> after assign Medina
        System.out.println(Testers[2]); // Osman

        System.out.println(Testers.length);    // 3

        System.out.println("=============================");

        String students [] = new String[10];
        // write a program that asks "enter a name" 10 times, and store each of the names in the array students
        //String names [] = new String[10];;

        Scanner name = new Scanner(System.in);

        for (int i = 0 ; i <=students.length-1; i++){
            System.out.println("Please enter students name");
            students[i]=name.nextLine();
        }

        for (int i = 0; i < students.length; i++){
            System.out.print(students[i] + " ");
        }


    }


}
