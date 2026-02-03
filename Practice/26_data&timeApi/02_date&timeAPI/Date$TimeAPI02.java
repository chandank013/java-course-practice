import java.lang.*;


import java.util.*;
import java.time.*;
import java.time.temporal.*;


public class Date$TimeAPI02
{

    public static void main(String args[])
    {
        
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        // Months & Days
        MonthDay md=MonthDay.now();
        System.out.println(md);


        // Periods
        Period p = Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));

        // Instant
        Instant i = Instant.now();
        System.out.println(i);

    }
}