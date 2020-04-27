package day10_Switch_Scanner;

public class SwitchStatement_Practice {

    public static void main(String[] args) {

        int num = 1;

        switch (num){
            case 1:     // if no break, the next available code fragment will be executed !!!
                System.out.println("Monday");
                //break;
            case 2:
                System.out.println("Tuesday");
                //break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default: // pay attention (no break)
                System.out.println("Invalid");
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}
