package OfficeHours.Practice_04_22_2020;

public class method_overloading {

    public static void main(String[] args) {

        method1();
        double num1 = method1(10);
        System.out.println(num1);

        method1(10,20);
        method1(30);

    }

    public static void method1(){
        System.out.println("Hello World");
    }

    public static double method1(int a){
        System.out.println("Hello Cybertek");
        return 123;
    }

    public static void method1(int a, int b){
        System.out.println("Hello Batch 18");

    }

    public static void method1(double a){
        System.out.println("Hello Batch 18");

    }
}
