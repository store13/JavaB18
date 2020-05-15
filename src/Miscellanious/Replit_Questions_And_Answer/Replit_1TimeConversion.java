package Miscellanious.Replit_Questions_And_Answer;

import java.util.Arrays;

public class Replit_1TimeConversion {
    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
    Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
    Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
    Function Description
    It should print a new string representing the input time in 24 hour format.
    timeConversion has the following parameter(s):
    s: a string representing time in  12 hour format
     */

    public static void main(String[] args) {
        String s = "07:05:45PM";
        String last = "";

        String [] arr = s.substring(0,s.length()-2).split(":");
        System.out.println(Arrays.asList(arr));



    }
}
