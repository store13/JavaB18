package OfficeHours.Practice_05_12_2020;

public class Constructor_Overload {
    /*
    method overloading : same name, parameter must be Different
     */

    public Constructor_Overload(){
        System.out.println("default constructor");
    }
    public Constructor_Overload(int a){
        System.out.println("constructor with int");
    }

    public Constructor_Overload(int a, double b){
        System.out.println("constructor with int and double");
    }

//    public Constructor_Overload(String a){
//        System.out.println("constructor with String");
//    }

    public static void main(String[] args) {
        Constructor_Overload obj = new Constructor_Overload(123);
        Constructor_Overload obj1 = new Constructor_Overload(123, 10.5);

    }



}
