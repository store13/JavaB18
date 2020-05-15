package OfficeHours.Practice_05_12_2020;

public class Constructor {

    /*
    Constructor : special method
            access- modifier ClassName(Parameter)
            NOT Mandatory    MUST    NOT Mandatory

    regular methods:
            access- modifier   specifier return-type methodName (Parameter){
                                            MUST        MUST
        }
     */

    public Constructor(){
        System.out.println("default constructor");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();
        System.out.println("=======================================");

        Employee employee1 = new Employee("Canan", 123, 120000);
        System.out.println(employee1.name);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);

        Employee employee2 = new Employee("Muhtar", 4556, 130_000);
        //System.out.println(employee2); // OfficeHours.Practice_05_12_2020.Employee@1b6d3586 (If we did not do toString Method)

        System.out.println(employee2);
    }
}

class  Employee{
    String name;
    long id;
    double salary;

    public Employee(String name, long id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }
}
