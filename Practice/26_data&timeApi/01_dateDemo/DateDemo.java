import java.lang.*;

import java.util.*;  // it available till jdk 7 and 8 onwards java provide  java.time API

strictfp public class DateDemo
{

    public static void main(String args[])
    {
        System.out.println(System.currentTimeMillis()); 
        System.out.println(((((System.currentTimeMillis()/1000)/60)/60)/24/365)); 

        Date d = new Date();
        System.out.println(d);

        Date dt= new Date(System.currentTimeMillis());
        System.out.println(dt);

        Date da=new Date("1/1/1970");
        System.out.println(da);

        Date dp = new Date("1/1/1900");
        System.out.println(dp.getYear()+1900);
        
        
        // this colendar is mutable
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));  // DATE, MONTH, YEAR.


        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); // Changing the time zone.
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getID());

    }
}