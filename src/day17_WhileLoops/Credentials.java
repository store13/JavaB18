package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {

    /*
        user: cybertek
        pass: cybertek123
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter User name");
        String username  = input.next();

        System.out.println("Enter Pass Word");
        String password  = input.next();

        boolean valid = (username.equals("cybertek") && password.equals("cybertek123") ); // false
        // validating the first username and password

        int count = 1;

        while( ! valid   ){
            // !true
            System.out.println("Please re enter your credentions");
            System.out.println("Enter User name");
            username  = input.next();

            System.out.println("Enter Pass Word");
            password  = input.next();

            valid = (username.equals("cybertek") && password.equals("cybertek123") );  // true
            // validating new username and passwords
            count++;

            if(count ==3 && !valid ){ // already have 3 attempts and credentials are still incorrect
                System.out.println("Your account is locked");
                break;
            }
            if(valid){ // it did not work properly ??? Below is Correct I guess, but Muhtar's worked ????
                System.out.println("Logged in");
            }
        }

//        if(valid){
//            System.out.println("Logged in");
//        }

        // System.exit(0), break, continue

    }
}
