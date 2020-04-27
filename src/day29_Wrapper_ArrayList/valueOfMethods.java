package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class valueOfMethods {
    /*
        valueOf method : converting string to wrapper class value, returns wrapper class values
        valueOf method of Boolean : any string other than "true" will ALWAYS return false, NOT case Sensitive

        MIN_VALUE : returns the minimum
        MAX_VALUE : return the maximum

        Wrapper class vs Primitives:
                default values:
                        All of wrapper class' default values are NULL

                 default values of primitives:
                        byte, short, int, long : 0
                        boolean : false
                        double, float : 0.0
                        char : empty space
     */

    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);       // Integer , object , 123

        System.out.println(a);

        double b= Integer.valueOf(str);     // unboxing
        // double = Integer
        System.out.println(b);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double = double  // none of the boxing type

        double d2 = Double.valueOf(str2);   // unboxing
        // double  = Double    // unboxing

        System.out.println(d1);     // 15.5
        System.out.println(d2);     // 15.5

        System.out.println(d1 == d2);

        System.out.println("==========================================");

        int z1 = 2000;
        // Long L1 = z1;   // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;

        /*
        "True"
        "FalSe" ==> to boolean
        "100000000.5" ==> to float
        "123456"  ==>
         */

        String r1 = "TrUE";
        Boolean t1 = Boolean.valueOf(r1); // Boolean, true
        // Boolean = Boolean  // none

        boolean t2 = Boolean.valueOf(r1); // Boolean, true
        // boolean = Boolean  // unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("==================================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);

        System.out.println("====================================");

        double [] arr = new double [3];
        System.out.println(Arrays.toString(arr)); // [0.0, 0.0, 0.0] - default


        boolean [] arr1 = new boolean[3];
        System.out.println(Arrays.toString(arr1)); // [false, false, false] - default

        Integer [] arr3 = new Integer[3];
        System.out.println(Arrays.toString(arr3)); // [null, null, null]





    }
}
