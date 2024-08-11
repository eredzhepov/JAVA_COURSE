package org.example.Lesson29.p3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test5 {
}
class Student {
    String name;
    char sex;
    int age;
    int cours;
    double avarage;

    public Student(String name, char sex, int age, int cours, double avarage) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.cours = cours;
        this.avarage = avarage;
    }
}

class StudentInfo {
    void printStudent(Student s) {
        System.out.println("Imya studenta " + s.name + ", pol " + s.sex + " vozrast " + s.age + " kurs " + s.cours +
                " ocenka " + s.avarage);
    }

    void testStuednts(ArrayList<Student> aL, Predicate<Student> t) {
        for (Student s : aL) {
            if (t.test(s)) printStudent(s);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 21, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 25, 5, 7.8);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Marina", 'f', 23, 1, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();
        si.testStuednts(list,(Student st) -> {return st.avarage > 8.5;});
        si.testStuednts(list,(Student st) -> {return st.age > 22;});
        si.testStuednts(list,(Student st) -> {return st.sex == 'f';});
        si.testStuednts(list,(Student st) -> {return st.age < 23;});
        si.testStuednts(list,(Student st) -> {return st.avarage < 7.5;});
        si.testStuednts(list,st ->  st.cours == 2);
        si.testStuednts(list,(Student st) -> {return st.sex == 'm' && st.avarage > 7.5;});

    }
}

