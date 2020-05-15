package OfficeHours.Practice_05_06_2020;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
 */

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTitle, double salary, long employeeID){
        this.name = name;           // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString(){
        return "Name: " + name + ", jobTitle: " + jobTitle + ", salary: " + salary + ", employeeID: " + employeeID;
    }

    public void smokeTesting(){
        System.out.println(name + " is doing smoke test"); // name points Instance variable, we don't need to use This keyword.
    }

    public void creatingTicket(){
        // int name = 200;  // if local variable is the same with instance variable, we should USE this keyword ..
        System.out.println(this.name + " is creating ticket on Jira");
    }


}
