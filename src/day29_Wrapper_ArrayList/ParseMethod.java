package day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ParseMethod {
    /*
     Methods:
        parse method : converts String of text to the primitives. NOT Case sensitive !! care about MEANING
                    "123"

                    parse method of boolean: any string other than "true" will return false
        valueOf method :
     */

    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);  // 123

        System.out.println(str+1);  // text
                    //     "123" + 1 ==> "1231"
        System.out.println(a1+1);   // number
                    //    123 + 1 ==> 124

        byte b1 = Byte.parseByte(str);  // byte = 123
        System.out.println(b1+15);

      //  Integer I1 = (int) Byte.parseByte(str);     // autoboxing (assign primitive to wrapper class)
        // Integer = (int) byte;    // explicit casting
        // Integer = int;

        String str2 = "12.5";
        float f1 = Float.parseFloat(str2);      // float 12.5
        System.out.println(f1+5);

        double d1 = Double.parseDouble(str2);   // double 12.5
        System.out.println(d1+1);

        String str3 = "3147483647";
        long num1 = Long.parseLong(str3);     // 3147483647L
        Long num2 = Long.parseLong(str3);     // autoboxing

        System.out.println(num1+ 2);
        System.out.println(num2);

//        double num2 = Long.parseLong(str3);
//        System.out.println(num2);
     // ============================================================

        String result1 = "false";
        boolean r1 = Boolean.parseBoolean(result1);      // boolean
        System.out.println( !r1 );  // true

        String result2 = "Today is Monday";     // not "true" or not "false" ==> false
        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(r2);

        String result3 = "fALsE";       // "false" , IGNORED Case Sensitivity , care Meaning !!!
        boolean r3 = Boolean.parseBoolean(result3);      // boolean
        System.out.println(r3);     // false
        System.out.println( !r3 );  // true


    }
}
