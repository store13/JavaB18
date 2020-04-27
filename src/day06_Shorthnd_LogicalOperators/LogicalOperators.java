package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1);   // false

        boolean result2 = ! (10 + 15 > 15);
        System.out.println(result2);    // false

        boolean result3 = !true == !false;
                //        false == true
        System.out.println(result3); // false

        boolean R1 = " Corona Virus" != "End of the world" && "Toilet Paper" == "Cure";
                    //                  true              &&   false ==> false

        boolean R2 = 10 > 15 && 15 < 13;
                //    false && false ==> false
        System.out.println(R1);
        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b' + 1 == 'c';
            //        97 =  98 -1 && 98 + 99 ==> true
        System.out.println(R3);

        boolean R4 = true != false || false == !true;
            //              true   ||      true      ==> true
        System.out.println(R4);

        boolean R5 = true != false && !false == !true;
            //          true       &&       false     ==> false
        System.out.println(R5);

        boolean R6 = !!!false;
                    // !!true
                    // !false
                    // true
        System.out.println(R6);

    }
}
