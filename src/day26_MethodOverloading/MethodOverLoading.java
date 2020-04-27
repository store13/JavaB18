package day26_MethodOverloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        method(10);      // "Original method"
        method(10.0);   // Overloaded method
    }

    public static void method(int a){
        System.out.println("Original method");
    }

    public static void method(int a, int b){
        System.out.println("Overloaded method");
    }

    public static void method(double a){
        System.out.println("Overloaded method");
    }
}
