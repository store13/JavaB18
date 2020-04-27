package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

//        int number = 0;
//
//        if (number >= 0) {
//            System.out.println(number + " is positive");
//        }
//        if (number < 0) {
//            System.out.println(number + " is negative");
//        }
//    // if else
//
//        if (number >= 0) {
//            System.out.println(number + " is positive");
//        }else{
//            System.out.println(number + " is negative");
//        }
        int number = 100;
        // single IF statement

        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }
        if (number % 2 != 0){
            System.out.println(number + " is odd number");
        }
        // if else

        boolean evenNumber = number % 2 == 0;
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }else { // otherwise
            System.out.println(number + " is odd number");
        }

        System.out.println("===================================");

        int age = 30;

        if (age >= 21){
            System.out.println("Here is your Vodka");
        } else{
            System.out.println("Go home kid");
        }

        System.out.println("===================================");

        boolean testedPositiveCorona = true;

        if (testedPositiveCorona){
            System.out.println("Buy more toilet papers and stay home");
        }else{
            System.out.println("Go to work");
        }




    }
}
