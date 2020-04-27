package day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        byte a = 4;

        float a1 = 4.5F;    // NOT Accepted
        long a2 = 10l;      // NOT Accepted
        double a3 = 2.5d;   // NOT Accepted
        boolean a4 = true;  // NOT Accepted

        switch (a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid case");
                break;

            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
        }
    }
}
