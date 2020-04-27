package day02_Variables;

import java.sql.SQLOutput;

public class EmployeeInfo_Variables {
    /*
    create a class called EmployyeInfo_Variables:
    print:
    your company's name
    your EmployeeName
    your EmployeeId
    your JobTitle
    your Salary
     */
    public static void main(String[] args) {
        String employeeName = "Fatih";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 120000.5;
        int ssn = 123456789;
        /*
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Id:" + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Social Security Number: " + ssn);

        */

        System.out.println("Employee Name:" + employeeName+ "\nCompanyName:" +
                companyName + "\nEmployee ID:" + employeeId + "\nJob Title:" +
                jobTitle + "\nSalary:" + salary + "\nSSN:" + ssn);

        System.out.println("==================================================================");

        String firstName = "Zeynep";
        String lastName = "Dere";
        // Full Name: Zeynep Dere
        System.out.println("Full Name: " + firstName + " " +  lastName );

        int a123 = 100;
        int num$ = 234;

        System.out.println(11+10);          // 21 ->  addition
        System.out.println("11" + "10");    // 1110 -> Concatenation
    }





}
