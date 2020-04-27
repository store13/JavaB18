package day20_Arrays_Continue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        /*
            String [] months = new String[12];
                    months[0] = "Jan";
                    ....
         */


        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //                      0    1      2       3      4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts = 1;

        while (num > 12 || num <= 0){
            System.out.println("Invalid Entry");
            System.out.println("Please enter re-enter between 1 - 12");
            num = input.nextInt();
            //System.exit(0);
            attempts++;

            if (attempts == 3 && (num >12 || num <= 0)){
                System.out.println("Invalid Entry, you already have 3 attempts");
                System.exit(0);
            }
        }

        String result = months[num-1];  // index number, index number stars from ALWAYS

        System.out.println(result);


    }
}
