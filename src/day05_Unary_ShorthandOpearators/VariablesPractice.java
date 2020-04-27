package day05_Unary_ShorthandOpearators;

public class VariablesPractice {

    public static void main(String[] args) {

        // whole numbers: byte, short, int, long
        // decimals : float, double

        int a1 = 100;

        float f1 = (long) a1; // burada otomatik oluyor zaten, manually yazdi Muhtar !
            // f1 = 100L;
            // f1 = 100.0
        System.out.println(f1);

        long l1 = (long)f1;
            // l1 = 100
        System.out.println(l1);

        String name;
        // System.out.println(name);   // local variables cannot be used without initializing
        // name = "Cybertek";  // in Java: first come first serve






    }
}
