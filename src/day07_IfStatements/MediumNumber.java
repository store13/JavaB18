package day07_IfStatements;

public class MediumNumber {
    /*
    4. write a java program that accepts three numbers and rteurn the mediam number(assume that none of them are equal)
     */
    public static void main(String[] args) {

        double a = 100;
        double b = 2000;
        double c = 30;
        /*
        a: if (a < b && a > c ) or (a > b && a < c)
        b: if (b < a && b > c ) or (b > a && b < c)
        c: if (c < a && c > b ) or (c > a && c < b)
         */

        boolean aMedium = (a < b && a > c ) || (a > b && a < c);
                // b < a < c  or c < a < b

        boolean bMedium = (b < a && b > c ) || (b > a && b < c);
                // a < b < c or c < b < a

        boolean cMedium = (c < a && c > b ) || (c > a && c < b);
                // a < c < b or b < c < a

        if ( aMedium) {
            System.out.println(a + " is the medium number");
        }
        if (bMedium) {
            System.out.println(b + " is the medium number");
        }
        if (cMedium) {
            System.out.println(c + " is the medium number");
        }



    }
}
