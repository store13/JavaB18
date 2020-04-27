package day04_JavaRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // 10/3 ==> 3.3333
        int a = 10 / 3 ;  // 3
        System.out.println(a);

        // 10 / 4 ==> 2.5
        System.out.println(10/4);   // 2

        double d = 10/4;
            // d = 2;
            // d ==> 2.0
        System.out.println(d);  // 2.0

        System.out.println(10.0 / 4);   // 2.5

        System.out.println(10 / 4.0 );  // 2.5

        System.out.println(10.0 / 4.0); // 2.5

        //   10 /4 = 2.5;
        float f1 = 10 / 4;      // 10/4F yaparsak, decimal is taken , result ==> 2.5 olur
        //   float f1 = 2;
        System.out.println(f1); // 2.0

        boolean evenNumber = 25 % 2 == 0;
                //              1 == 0 ==> false
                // if 25/2 has aremainder of zero, then it's even number
        System.out.println(evenNumber); // false
        System.out.println(25%2);

        boolean oddNumber = 22%2 != 0;  // odd num
                    //      0 !0= 0 ==> false
        System.out.println(oddNumber);

        System.out.println(10 % 2 == 0);    // 10 is even number
        System.out.println(11 %2 != 0);     // 11 is odd number

        System.out.println("10 is even number; " + (10 % 2 == 0));
        System.out.println("11 is even number" + (11 %2 != 0));

        System.out.println("25 is odd number" + (25 %2 != 0));

        System.out.println("25 is even number" + (25 %2 == 0));
        System.out.println("25 is even number" + !(25 %2 != 0));


















    }



}
