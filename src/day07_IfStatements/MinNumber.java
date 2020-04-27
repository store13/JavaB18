package day07_IfStatements;

public class MinNumber {
    /*
    3. write a java program that accepts three numbers and return the minimum number(assume that none of them are equal)
     */
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b && a < c;
        boolean bMin = b < a && b < c;
        boolean cMin = c <a && c < b;

        if (aMin) {
            System.out.println(a + " is the minimum number");
        }
        if (bMin) {
            System.out.println(b + " is the minimum number");
        }
        if (cMin) {
            System.out.println(c + " is the minimum number");
        }

    }
}
