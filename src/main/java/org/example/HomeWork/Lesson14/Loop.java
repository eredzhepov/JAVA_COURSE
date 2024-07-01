package org.example.HomeWork.Lesson14;

public class Loop {
    public static void showTime() {
        HOURES:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTES:
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hour > 1 && minutes % 10 == 0) {
                    System.out.println("hour > 1");
                    break HOURES;
                }

                SECONDS:
                for (int seconds = 0; seconds <= 59; seconds++) {

                    if (seconds * hour > minutes) {
                        System.out.println("seconds*hour");
                        continue MINUTES;
                    }
                    System.out.println(hour + " : " + minutes + " : " + seconds);
                }
            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
