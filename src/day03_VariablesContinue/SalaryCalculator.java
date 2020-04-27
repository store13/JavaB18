package day03_VariablesContinue;

public class SalaryCalculator {
    /*
        Warm up Task: Create a class salary calculator, write a program that can calculate the tax, and salary
        ex:
        if:
        rate = 55;
        stateTaxRate = 0.04;
        federalTaxRate = 0.22;
        weeklyHours = 40;

        then output will be:
        your salary is: 105600 USD
        your total tax is : 27456 USD
        your income after tax is: 78144 USD
         */

    public static void main(String[] args) {

        int hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 48;


        // salary = hourlyRate * weeklyHours * 52

        double salary = hourlyRate * weeklyHours * totalWeeks; // Gross Income , salary before tax

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // totalTax = stateTax + federalTax
        double totalTax = stateTax + federalTax;

        // salaryAfterTax = salary - totalTax
        double salaryAfterTax = salary - totalTax;


        System.out.println("Your salary is: $ " + salary + "\nYour Total Tax is: $ " + totalTax
                +"\nIncomeAfterTax: $ " + salaryAfterTax);

    }
}
