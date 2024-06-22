package org.example.lesson8;

public class Student {
    String name;
    int course;
    static int count;
    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 1);
        Student s2 = new Student("Petr", 4);
        Student s3 = new Student("Masha", 2);
        System.out.println(s1.name);
        System.out.println(count);

    }
}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 1);
        Student s2 = new Student("Petr", 4);
        Student s3 = new Student("Masha", 2);
        System.out.println(s1.name);
        System.out.println(Student.count);

    }
}