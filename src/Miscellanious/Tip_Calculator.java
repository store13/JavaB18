package Miscellanious;

import java.util.*;

public class Tip_Calculator {

    public static void main(String[] args) {

        int numberOfPeople = 0;
        double amount, totalToPay, totalPerPerson = 0;
        double totalTip = 0;
        double tipPerPerson = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Split?");
        String split = scan.next();

        if (split.equalsIgnoreCase("no")) {
            numberOfPeople = 1;
        } else if (split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people:");
            numberOfPeople = scan.nextInt();
            if (numberOfPeople > 10) {
                numberOfPeople = 10;
            }

        }
        System.out.println("Check amount:");
        amount = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        if (serviceQuality.equalsIgnoreCase("Poor")) {
            totalTip = amount * 0.05;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip = amount * 0.10;
        } else if (serviceQuality.equalsIgnoreCase("Good")) {
            totalTip = amount * 0.15;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip = amount * 0.20;
        } else if (serviceQuality.equalsIgnoreCase("Excellent")) {
            totalTip = amount * 0.25;
        }


        System.out.println();
        //System.out.println("########### GUEST CHECK ##########");


        if (numberOfPeople == 1) {
            System.out.println("Number of people entered :&");
        } else if (numberOfPeople == 2) {
            System.out.println("Number of people entered:&&");
        } else if (numberOfPeople == 3){
            System.out.println("Number of people entered:&&&");
        } else if (numberOfPeople == 4) {
        System.out.println("Number of people entered:&&&&");
        } else if (numberOfPeople == 5) {
        System.out.println("Number of people entered:&&&&&");
        } else if (numberOfPeople == 6) {
        System.out.println("Number of people entered:&&&&&&");
        } else if (numberOfPeople == 7) {
        System.out.println("Number of people entered:&&&&&&&");
        } else if (numberOfPeople == 8) {
        System.out.println("Number of people entered:&&&&&&&&");
        } else if (numberOfPeople == 9) {
        System.out.println("Number of people entered:&&&&&&&&&");
        } else if (numberOfPeople == 10) {
        System.out.println("Number of people entered:&&&&&&&&&&");
    }

    totalToPay = amount + totalTip;
    tipPerPerson = totalTip / numberOfPeople;

    totalPerPerson = totalToPay / numberOfPeople;

        System.out.println("Total to pay:" + totalToPay);

        System.out.println("Total tip:" + totalTip);

        System.out.println("Total per person:" + totalPerPerson);

        System.out.println("Tip per person:" + tipPerPerson);
}


        }

