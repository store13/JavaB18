package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.time.LocalDate;

public class WU_4_24_2020 {
    /*
    Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store their birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
     */
    public static void main(String[] args) {

        String friends [] = {"Abdul", "Baris", "Sayed", "Parida", "Irina"};
        LocalDate [] birthdays = {LocalDate.of(1990,1,1),
                                  LocalDate.of(1991,2,2),
                                  LocalDate.of(1992,3,3),
                                  LocalDate.of(1993,4,4),
                                  LocalDate.of(1994,5,5),

        };

        for (int i = 0; i < friends.length; i++){
            System.out.println(friends[i] + " -- " + birthdays[i]);
        }
    }
}
