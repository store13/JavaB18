package day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {

    public static void main(String[] args) {

        // if statement without curly braces: the block can only contain a single statement without the curly brace
        // if(9>8)
        // System.out.println("9 is greater than 8");
        // THIS IS NOT A GOOD HABIT
        int number= 100;

        if (number %2 ==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        if (9>8)  // if the block containing more than one statement we MUST give the body
            System.out.println("Hello");
            System.out.println("Condition is true"); // Take Care this and below execute even condition is NOT TRUE !!!
            System.out.println("Test executed");


    }
}