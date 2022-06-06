/*
 * LocalDateTimeDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch16_exception_assertion_localization.localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LocalDateTimeDemo
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // October 20, 2020 at11:12
    }
}



/*
 * Changes:
 * $Log: $
 */