package day10_Switch_Scanner;

public class daysInMonth {
    /*
    4.  write a program that can find the number of days in a month(Assume that Feb has 28 days)
    28 days: 2
    30 days: 4,6, 9, 11
    31 days: 1,3,5,7,8,10,12
    MUST USE NESTED IF
     */
    public static void main(String[] args) {

        int num = 12;
        boolean day28 = num == 2;
        boolean day30 = num == 4 || num == 6 || num == 9 || num == 11;

        String result = "";

        if (num > 0 && num < 13){

            result = (day28) ? "Has 28 days" : (day30) ? "Has 30 days" : "Has 31 days";

        }else{
            result = "Invalid";
        }

        System.out.println(result);
    }

}
