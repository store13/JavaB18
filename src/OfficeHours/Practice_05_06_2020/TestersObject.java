package OfficeHours.Practice_05_06_2020;

public class TestersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.name = "Muhtar";
        tester1.jobTitle = "SDET";
        tester1.salary = 900000;
        tester1.employeeID = 123345090;

        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Adam", "QA Automation Engineer", 105000, 123445667);
        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();

        tester2.creatingTicket();


    }
}
