package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    /*
    Task: Scanner_Practice1
    1.  ask the user enter first name
    2.  ask user to enter last name
    3.  ask the user employed or not? true ==> employed, false ==> unemployed
    4.  if he is employed , ask the salary
    5.  if he is not employed set the salary to 0
        output:
        full name:
        employed status:
        salary:
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.next();

        System.out.println("Enter last name");
        String lastName = input.next();

        String fullName = firstName + " " +lastName;

        System.out.println("Are you employed or not?");
        boolean employeedStatus = input.nextBoolean();

        double salary = 0;

        if(employeedStatus == true){
            System.out.println("Enter your salary: ");
            salary = input.nextDouble();
        }

        System.out.println("Full Name: " + fullName);
        System.out.println("Employed: " + employeedStatus);
        System.out.println("Salary: " + salary);






    }
}
