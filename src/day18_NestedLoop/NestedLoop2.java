package day18_NestedLoop;

public class NestedLoop2 {

    public static void main(String[] args) {

        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *
            * * * * * * *
            * * * * * * * *
            * * * * * * * * *

         */

        for (int j = 1; j <= 9; j++){
            for (int i = 1; i <=j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================================");
        /*

         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * *
         *

         */
        for (int i = 1; i <= 9; i++){
            for (int j = 9; j >=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("==========================");

        /*
            a
            a b
            a b c
            a b c d
            a b c d e
            a..................z

         */

        for (char zh = 'a'; zh <= 'z'; zh++){
            for (char ch = 'a'; ch <= zh ; ch++){
                System.out.print(ch + " " );
            }
            System.out.println();
        }
        System.out.println("==================================================");

        for (char zh = 'z'; zh >= 'a'; zh--){
            for (char ch = 'a'; ch <= zh ; ch++){
                System.out.print(ch + " " );
            }
            System.out.println();
        }

    }
}
