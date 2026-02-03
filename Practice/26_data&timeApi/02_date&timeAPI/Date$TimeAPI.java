import java.lang.*;

import java.util.*;
import java.time.*;
import java.time.temporal.*;


public class Date$TimeAPI
{

    public static void main(String args[])
    {
        Date d=new Date();
        d.setHours(21);
        System.out.println(d);


        LocalDate dt=LocalDate.now();
        System.out.println(dt);


        LocalDate dt1=LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dt1);

        LocalDate dt2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt2);

        LocalDate dt3=LocalDate.of(2020, Month.MARCH, 10);
        System.out.println(dt3);

        LocalDate dt4=LocalDate.ofEpochDay(1);
        System.out.println(dt4);

        LocalDate dt5=LocalDate.parse("2020-01-03");
        System.out.println(dt5);

        LocalDate dt6=LocalDate.parse("2020-01-03");
        LocalDate dt7=dt6.plusMonths(6);
        System.out.println(dt7);

        LocalTime dt8=LocalTime.now();
        System.out.println(dt8);
        LocalTime dt9=dt8.minusHours(3);
        System.out.println(dt9);

        LocalDateTime dt01=LocalDateTime.now();
        System.out.println(dt01);

    }
}