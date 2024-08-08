package org.example.Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024,9,1,16,40);
        LocalTime lt = LocalTime.of(10,30);
        Period p = Period.ofMonths(3).ofDays(10);
        //System.out.println(nachalo.plus(p));
        Duration d = Duration.ofHours(1);
        //System.out.println(lt.plus(d));
//        System.out.println(nachalo);
//        System.out.println(nachalo.plus(d).plus(p));
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ldt.format(d2));

    }
}
