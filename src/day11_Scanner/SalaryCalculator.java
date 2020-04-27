package day11_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    write a program that can calculate the salary after tax
    needed informations:
    employee' salary
    state tax
    federal tax
    MUST use Scanner
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter state tax: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter the federal tax: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0; // 10 /3 ==> 3.3333

        // totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        // salaryAftertax = salary - totalTax
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $" + salaryAfterTax);

        System.out.println("Total tax: $" + totalTax);

    }
}
