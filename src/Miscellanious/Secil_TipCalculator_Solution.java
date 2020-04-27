package Miscellanious;

import java.util.Scanner;

public class Secil_TipCalculator_Solution {
    public static void main(String[] args) {

        int numOfPeople=0;
        double checkAmount, totalToPay, totalPerPerson=0;
        double totalTip= 0;
        double tipPerPerson = 0;
        String splitYesNo, serviceQuality;

        Scanner scan = new Scanner(System.in);

        System.out.println("Check amount: ");
        checkAmount = scan.nextDouble();

        System.out.println("Split? -Yes or No");
        splitYesNo = scan.next();

        if (splitYesNo.equalsIgnoreCase("No")) {
            numOfPeople=1;

        }else if (splitYesNo.equalsIgnoreCase("Yes")) {
            System.out.println("Number of people: ");
            numOfPeople = scan.nextInt();
            if (numOfPeople>10){
                numOfPeople=10;
            }
        }


        System.out.println("Service Quality: ");
        serviceQuality = scan.next();
        if (serviceQuality.equalsIgnoreCase("Poor")) {
            totalTip= checkAmount*0.05;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip= checkAmount*0.10;
        }else if (serviceQuality.equalsIgnoreCase("Good")) {
            totalTip= checkAmount*0.15;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip= checkAmount*0.20;
        }else if (serviceQuality.equalsIgnoreCase("Excellent")) {
            totalTip= checkAmount*0.25;
        }

        System.out.println("Check amount:  "+ checkAmount);
        System.out.println("Service Quality:"+ serviceQuality);
        System.out.println();
        System.out.println("########### GUEST CHECK ##########");
        //System.out.println("Number of people entered :"+ numOfPeople);
        if (numOfPeople==1) {
            System.out.println("Number of People entered :&");
        }else if (numOfPeople==2) {
            System.out.println("Number of People entered:&&");
        }else if (numOfPeople==3) {
            System.out.println("Number of People entered:&&&");
        }else if (numOfPeople==4) {
            System.out.println("Number of People entered:&&&&");
        }else if (numOfPeople==5) {
            System.out.println("Number of People entered:&&&&&");
        }else if (numOfPeople==6) {
            System.out.println("Number of People entered:&&&&&&");
        }else if (numOfPeople==7) {
            System.out.println("Number of People entered:&&&&&&&");
        }else if (numOfPeople==8) {
            System.out.println("Number of People entered:&&&&&&&&");
        }else if (numOfPeople==9) {
            System.out.println("Number of People entered:&&&&&&&&&");
        }else if (numOfPeople==10) {
            System.out.println("Number of People entered:&&&&&&&&&&");
        }
        totalToPay = checkAmount + totalTip;
        tipPerPerson = totalTip/numOfPeople;

        totalPerPerson =totalToPay/numOfPeople;

        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: "+ totalTip);


        System.out.println("Total per person: "+ totalPerPerson);
        System.out.println("Tip per person: "+ tipPerPerson);

    }

}

