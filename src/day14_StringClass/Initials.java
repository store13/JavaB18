package day14_StringClass;

import java.util.Scanner;

public class Initials {
/*
1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        String firstNameInitial = firstName.substring(0,1).toUpperCase();
        String lastNameInitial = lastName.substring(0,1).toUpperCase();

        String Initials = firstNameInitial.concat(lastNameInitial);

        System.out.println(Initials);

        // Muhtar'S Solution
        String initials = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();
        //initials = initials.toUpperCase();
        System.out.println(initials);

        // 2nd option (CharAt ())
        String initials2 = "" + firstName.charAt(0) + lastName.charAt(0);   // returns string
        initials2 = initials2.toUpperCase();
        System.out.println(initials2);


    }
}
