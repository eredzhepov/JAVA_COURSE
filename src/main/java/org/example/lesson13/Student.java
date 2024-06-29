package org.example.lesson13;

public class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);
        if (st1.grade == 2) {
            System.out.println("Student dvoishnik");
        } else if (st1.grade == 3) {
            System.out.println("Student troishnik");
        } else if (st1.grade ==4) {
            System.out.println("Student horoshist");
        } else if (st1.grade ==5) {
            System.out.println("Student otlichnik");
        } else {
            System.out.println("Ocenka ne verna");
        }
        switch (st1.grade) {
            case 2:
                System.out.println("Student dvoishnik");
                break;
            case 3:
                System.out.println("Student troishnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:
                System.out.println("Ocenka ne verna");

        }

    }
}
