package day38_Constructors;

public class Test {
    /*
    static block vs instance block vs constructor:
            static block: executed first, one time only, does not depend on the object
            instance block: depends on the object, runs before the constructor
            constructor: depends on the object, runs after the instance block

     */

    public Test() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }


    public static void main(String[] args) {
        new Test(); // instance, constructor
        System.out.println("Main method ");

        //    new Test(); //instance, constructor
    }

    static {
        System.out.println("Static block");
    }
}