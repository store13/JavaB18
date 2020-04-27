package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    /*
    DateTimeFormatter:
            DateTimeFormatter.ofPattern("")
            year : yy, yyyy
            Month: MM(number), MMM(3 letters) , MMMM (full month name)
            day  : dd
            days name: EEE (3 letters) , EEEE( full name)
     */
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM/yy/dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));
        System.out.println(date1.format(dtf1));
        System.out.println(date1.format(dtf2));

        /*
        create a date called birthDay: month/Days/year
                ex: 2020 04  23
                    April/23/20
         */

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEE MMM/dd/yy");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");

        LocalDate date2 = LocalDate.of(1999,12,25);
        String str1 = date2.format(dtf3);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf3));
        System.out.println(date3.format(dtf4));

    }
}
