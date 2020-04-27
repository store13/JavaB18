package day29_Wrapper_ArrayList;

public class Wrapper_Class {
    /*
    Data Structure:
        1. Array
        2. Collections ==> only accepts Objects
        3. Maps        ==> only accepts Objects

        primitives :
        byte , short, int, long, float, double , char , boolean

        Wrapper classes :  that are dedicated to primitives
        Byte, Short, Integer, Long, Float, Double, Char, Boolean

        presented in "java.lang" package
     */
    public static void main(String[] args) {

        int a = 100;     // primitive
        Integer b = a; // wrapper class

        short s1 = 200;
        int n1 = s1;
        //Integer N1 = s1;    // Integer is dedicated to int primitive , only local to int
        Integer n2 = n1;

        // =======================================================================
        int a1 = 20;
        float f1 = a1;

        // Float f2 = a1;   // Float is dedicated to float primitive

        Integer I1 = 200;
        int a2 = I1;

        Byte B1 = 126;
        int a3 = B1;
        System.out.println(a3);




    }
}
