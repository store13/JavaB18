package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    /*
    LocalTime : hours, minutes, seconds
    LocalTime now: LocalTime.now(); ==> returns the current time
    LocalTime time1 = LocalTime.of(hour, minutes, second)
    DateTimeFormatting:

        year: yy, yyyy
        months: MM, MMM, MMMM
        days : dd
        days name : E, EEE

        hour    : hh
        minute  : mm
        second  : ss
        am / pm : a
    .....
     */

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        LocalTime time2 = LocalTime.of(15,50,45);
        System.out.println(time2);





    }
}
