package org.example.Lesson4;

public class Student {
    int studentsNumber;
    String name;
    String surname;
    int year;
    double economEverageRating;
    double mathEverageRating;
    double languageEverageRating;
    public double avarageGradeCalculating( Student student){
        double avarageGrade = (student.economEverageRating + student.mathEverageRating + student.languageEverageRating)/3;
        return avarageGrade;
    }

    public Student(int studentsNumber, String name, String surname, int year, double economEverageRating, double mathEverageRating, double languageEverageRating) {
        this.studentsNumber = studentsNumber;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.economEverageRating = economEverageRating;
        this.mathEverageRating = mathEverageRating;
        this.languageEverageRating = languageEverageRating;
    }

    public Student(int studentsNumber, String name, String surname, int year) {
        this.studentsNumber = studentsNumber;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Student(){

    }
}
class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student(4, "Иван", "Петров", 4,76,23,53);
        Student student5 = new Student(4, "Ярослав", "Ветров", 3);

        student1.studentsNumber = 1;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.year = 2026;
        student1.economEverageRating = 84;
        student1.mathEverageRating = 85;
        student1.languageEverageRating = 75;

        student2.studentsNumber = 2;
        student2.name = "Petr";
        student2.surname = "Petrov";
        student2.year = 2028;
        student2.economEverageRating = 60;
        student2.mathEverageRating = 66;
        student2.languageEverageRating = 80;

        student3.studentsNumber = 3;
        student3.name = "Islam";
        student3.surname = "Magomedov";
        student3.year = 2025;
        student3.economEverageRating = 90;
        student3.mathEverageRating = 75;
        student3.languageEverageRating = 85;

        System.out.println("Средняя арифметическая оценка " + student1.name + " " + student1.surname + " = " + (student1.economEverageRating + student1.mathEverageRating + student1.languageEverageRating)/3);
        System.out.println("Средняя арифметическая оценка " + student2.name + " " + student2.surname + " = " + (student2.economEverageRating + student2.mathEverageRating + student2.languageEverageRating)/3);
        System.out.println("Средняя арифметическая оценка " + student3.name + " " + student3.surname + " = " + (student3.economEverageRating + student3.mathEverageRating + student3.languageEverageRating)/3);

        System.out.println("Средняя арифметическая оценка " + student1.avarageGradeCalculating(student1));
        System.out.println("Средняя арифметическая оценка " + student2.avarageGradeCalculating(student2));
        System.out.println("Средняя арифметическая оценка " + student3.avarageGradeCalculating(student3));
    }
}
