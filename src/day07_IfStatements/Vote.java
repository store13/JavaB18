package day07_IfStatements;

public class Vote {
    /*
    5. write a java program that can identify if a person is eligible to vote : 18
     */

    public static void main(String[] args) {

        int age = 16;
        boolean UScitizen = true;

        boolean eligible = age >= 18 && UScitizen == true;

        if (eligible) { // (eligible == true)
            System.out.println("You are eligible to vote");
        }

        if (!eligible) { // (eligible == false or eligible != true) could be written as well - same
            System.out.println("You are NOT eligible to vote");
        }
    }
}
