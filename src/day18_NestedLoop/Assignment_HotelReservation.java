package day18_NestedLoop;

import java.util.Scanner;

public class Assignment_HotelReservation {

    public static void main(String[] args) {
        /*
        Assignment :

        Write a program for the room reservation:

        King Bed ===> 120$
        Queen Bed --> 100$
        Single Bed ==> 80$

        should ask which bedroom do you wanna reserve
        if user provided invalid entry => please re-enter

        calculate the total price

        do you want to reserve another room:
                    if yes ==> repeat the previous steps
                    if no ==> your total price is: $$$

                    if answer either yes or no ==> please re-enter
         */
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;

        while(true){
            System.out.println("Which bedroom do you wanna reserve?");
            String Answer = input.nextLine();

            while (!(Answer.equalsIgnoreCase("King Bed") || Answer.equalsIgnoreCase("Queen Bed")
                    || Answer.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid Type of Bedroom, please re-enter : King Bed or Queen Bed or Single Bed");
                Answer = input.nextLine();
            }

            if(Answer.equalsIgnoreCase("King Bed")){
                totalPrice += 120;
            }else if(Answer.equalsIgnoreCase("Queen Bed")){
                totalPrice += 100;
            }else if (Answer.equalsIgnoreCase("Single Bed")){
                totalPrice += 80;
            }
                System.out.println("Your total price is: $"+totalPrice);

                System.out.println("Do you want to reserve another room?");
                String YesOrNo = input.nextLine();
                if (YesOrNo.equalsIgnoreCase("yes")){
                    continue;
                } else if (YesOrNo.equalsIgnoreCase("no")){
                    System.out.println("Your total Price is: $" + totalPrice);
                    break;
                }
            }


        }

}
