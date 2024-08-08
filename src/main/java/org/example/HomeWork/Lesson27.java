package org.example.HomeWork;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lesson27 {
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MMMM-dd !! hh:mm");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MM/yy");
    public void smena(LocalDateTime nachalo, LocalDateTime konec, Period period, Duration duration){
        LocalDateTime ldt = nachalo;
        while(ldt.isBefore(konec)){
            System.out.print("Работаем с " + ldt.format(format1));
            ldt = ldt.plus(period);
            System.out.println(" До " + ldt.format(format1));
            System.out.print("Отдыхаем с: " + ldt.format(format2));
            ldt = ldt.plus(duration);
            System.out.println(" До " + ldt.format(format2));
        }
    }
    public static void main(String[] args) {
        LocalDateTime nachalo = LocalDateTime.of(2024,6,6,9,00);
        LocalDateTime konec = LocalDateTime.of(2024,8,6,9,00);
        Period p = Period.ofDays(2);
        Duration d = Duration.ofDays(2);
        Lesson27 l = new Lesson27();
        l.smena(nachalo,konec,p,d);
    }

}
