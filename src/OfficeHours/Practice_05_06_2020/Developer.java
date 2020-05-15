package OfficeHours.Practice_05_06_2020;
/*
create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
 */

public class Developer {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setDeveloperInfo(String name, String jobTitle, double salary, long employeeID){
        this.name = name;           // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString(){
        return "Name: " + name + ", jobTitle: " + jobTitle + ", salary: " + salary + ", employeeID: " + employeeID;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixingBugs(){
        System.out.println(name + " is crying");
    }

}
