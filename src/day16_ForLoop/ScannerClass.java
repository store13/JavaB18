package day16_ForLoop;

import java.util.Scanner;

public class ScannerClass {
    /*
    Scanner class: has the methods to help us to get the user input
    presented in "java.util" package
    in order to use the scanner first we will have to import it:
    syntax:
    import packageName.className;
    import java.util.Scanner;
    import statement MUST be places between class name and package name:package A;
    import java.util.Scanner;
    public classB{}declare scanner:
    Scanner variableName  =  new  Scanner(System.in);
    variableName: will be reference to scanner object
                  though variableName we can call the methods of scanner
     */
    public static void main(String[] args) {
        // Scanner variableName  =  new  Scanner(System.in)
        Scanner input = new Scanner(System.in);

        // methods of Scanner:
        // nextByte():
        System.out.println("Enter a byte number: ");
        byte num1 = input.nextByte();

        System.out.println("You have entered " + num1);

        if (num1 %2 == 0){
            System.out.println(num1 + " is even number");
        }else{
            System.out.println(num1 + " is odd number");
        }

    }

}
