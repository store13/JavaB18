package day13_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulations_Practice {
    public static void main(String[] args) {

        /*
            input: cyBerTek sChooL

            output:
            Cybertek
            School
         */
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your full name");
//        String fullName = input.nextLine();     // cybertek school
//
//        String firstName = fullName.substring(0, fullName.indexOf(" "));
//        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
//
//        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
//        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
//
//        System.out.println("Your first name is " + firstName);
//        System.out.println("Your last name is " + lastName);

        /*
        Assignment :
        write a program that asks the user first and last names, then prints the initials.
        ex:
            input:
            cybertek
            school
          output:
          CS
         */

        Scanner input = new Scanner(System.in); // already exist at the above

        System.out.println("Enter your first name");
        String fName = input.nextLine();
        System.out.println("Enter your last name");
        String lName = input.nextLine();

        String initials = fName.substring(0, 1).toUpperCase() + lName.substring(0,1).toUpperCase();
        System.out.println(initials);

    }
}
