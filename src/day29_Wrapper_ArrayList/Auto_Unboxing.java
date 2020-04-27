package day29_Wrapper_ArrayList;

public class Auto_Unboxing {
    /*
    AutoBoxing: converting primitive values to Wrapper class object
                    int a = 100;
                    Integer b  = a  // auto boxing

    Unboxing : converting  wrapper class object value to primitives
                    Integer a = 100;
                    int b = a;

     */

    public static void main(String[] args) {

        int a  = 100;       // primitive

        Integer b = a;      // Autoboxing , converts ....

        Byte byte1 = 98;
        short short1 = byte1;   // unboxing
        byte b2 = byte1;        // unboxing
        int int1 = byte1;       // unboxing


    }


}
