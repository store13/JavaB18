package Miscellanious.ReplitAnswersFromMuhtar;


import java.util.Scanner;

public class A47_realEstate {

    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        int Price = 0;

        System.out.println("Enter your property type:");
        String house = scan.nextLine();

        if(house.equalsIgnoreCase("Condo")){
            Price = 50_000;
        } else if(house.equalsIgnoreCase("Townhouse")) {
            Price = 75_000;
        }else {
            Price = 95_000;
        }

        System.out.println("How many bedrooms do you have?");
        int Bedrooms = scan.nextInt();

        Price += Bedrooms*30_000;

        System.out.println("Do you have a backyard?");
        boolean backyard1 = scan.nextBoolean();
        if(backyard1) {
            if(house.equalsIgnoreCase("Condo")) {
                System.out.println("Backyard is not available for condo!");
            } else {
                Price += 5_000;

            }
        }

        System.out.println("Do you have garage?");
        boolean garage1 = scan.nextBoolean();

        if(garage1){
            System.out.println("How many spots?");
        }
        int garageS = scan.nextInt();

        if(garageS>=1 && garageS<=10) {
            Price += garageS*20_000;
        } else {
            System.out.println("Pardon, it's not a public parking!");
        }

        System.out.println("How close is metro station?");
        float metro = scan.nextFloat();

        if(metro<=1) {
            Price += 10000;
        }

        if(metro>1 && metro<=3) {
            Price +=5000;
        }

        System.out.println("How close is highway?");
        float highway = scan.nextFloat();
        if(highway<=1) {
            Price += 15000;
        }
        if(highway>1 && highway<=5) {
            Price += 8000;
        }
        if(highway>5 && highway<=20) {
            Price += 4000;
        }

        System.out.println("What's the rating of nearest school?");
        float school = scan.nextFloat();
        if(school<=10 && school>=8){
            Price += 45000;
        } else if( school<8 && school>=4) {
            Price += 20000;
        } else {
            Price += 5000;
        }

        System.out.println("Does any of your family members smoking?");
        boolean smoking1 = scan.nextBoolean();

        if(smoking1) {
            Price -= 5000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + Price +"$");
    }
}


