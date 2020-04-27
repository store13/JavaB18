package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 7921 JonesBranch Dr, McLean VA, 22034
        // fullAddress: Building-Number, Street, City, State, Zipcode

        System.out.println("Building Number: ");
        //int BNumber = input.nextInt();     // 7925
        String BNumber = input.next();       // 7925B -- if the number is with word like 53636B

        input.nextLine();        // used for taking out Enter from scanner

        System.out.println("Street: ");
        String street = input.nextLine();

        System.out.println("Street is: "+ street);

        System.out.println("Enter the zip code: ");
        int zipcode = input.nextInt();    // 22034Enter

        input.nextLine();    // take out the Enter

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();

        String fullAddress = BNumber + " " + street + ", " + cityState+ " " + zipcode;

        System.out.println(fullAddress);

        input.close();       // closes the scanner (scanner variable).  It is NOT MANDATORY , But it is RECOMMENDED.
                            // After close, if you wanna use again scanner variable, you should create a new Scanner variable




    }
}
