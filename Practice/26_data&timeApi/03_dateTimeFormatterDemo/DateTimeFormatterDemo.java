import java.lang.*;

import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;



public class DateTimeFormatterDemo
{

    public static void main(String args[])
    {
        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime dt1 = ZonedDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");  // we can use farmat according to our necessity.
        System.out.println(df.format(dt1));

        // ChoroFiled
        System.out.println(dt.get(ChronoField.YEAR));

    }
}