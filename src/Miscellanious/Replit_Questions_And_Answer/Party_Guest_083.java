package Miscellanious.Replit_Questions_And_Answer;

import java.util.Scanner;

public class Party_Guest_083 {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // your code

        System.out.println ("Please enter guest name:");
        String guestList = input.next();

        System.out.println("Do you want to enter new guest name:");
        String newGuestYesOrNo = input.next();

        while(newGuestYesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String newguest = input.next();

            System.out.println("Do you want to enter new guest name:");
            newGuestYesOrNo = input.next();
            guestList +=  ", " + newguest ;
        }

        System.out.println ("Guest's list: " + guestList);



    }
}
