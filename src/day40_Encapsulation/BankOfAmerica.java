package day40_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo Abdul = new EmployeeInfo();
        Abdul.setAddress("Virginia");
        Abdul.setSalary(120000.50);

        System.out.println( Abdul.getAddress() );
        System.out.println( Abdul.CompanyName );
        System.out.println( Abdul.getSalary() );

    }

}

