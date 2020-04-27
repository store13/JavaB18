package OfficeHours.Practice_04_22_2020;

public class void_Method {

    public static void main(String[] args) {

        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("===========================");

        print();

        System.out.println("===========================");

        boolean USCitizen = true;
        int age = 21;

        Vote(age, USCitizen);

        Vote(35, false);

        //28
        EligibleToBeCig(17);


    }

    public static void print (){

        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
    }

    // write a function that can identify if a person is eligible to vote
    // MUST know : age, USCitizen

    public static void Vote(int age, boolean USCitizen){

        boolean eligibleToVote = age >= 10 && USCitizen == true;
        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are NOT eligible to vote yet");
        }
    }

    // write a program if a person is eligible to buy cigarette
    // MUST know: age,
    public static void EligibleToBeCig (int age){
        if (age >= 18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible to buy");
        }
    }

}

