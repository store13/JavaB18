package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {

    public static void main(String[] args) {

        LocalDateTime dt1 = LocalDateTime.of(2015,12,25,13,30,45);
        System.out.println(dt1);

        // 12/25/2015 11:30 am, day(Fri)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");
        System.out.println(dt1.format(dtf));

        String str = dt1.format(dtf);
        System.out.println(str);




    }
}
