package org.example.Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test4 {
    static void smenaDezhurnogo(LocalDate nachalo, LocalDate konec, Period p){
        LocalDate date = nachalo;
        while(date.isBefore(konec)){
            System.out.println("Наступила дата " + date + " пора менять дежурного" );
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2024,9,1);
        LocalDate konec = LocalDate.of(2025,5,31);
        Period p = Period.ofWeeks(2);
        smenaDezhurnogo(nachalo,konec,p);
    }
}
