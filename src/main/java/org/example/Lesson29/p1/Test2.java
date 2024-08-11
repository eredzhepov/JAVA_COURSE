package org.example.Lesson29.p1;

import java.util.ArrayList;

public class Test2 {
}
class Student{
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
class StudentInfo{
    void printStudent(Student s){
        System.out.println("Imya studenta " + s.name + ", pol " + s.sex + " vozrast " + s.age + " kurs " + s.cours +
                " ocenka " + s.avarage );
    }
    void printStudentsOverGrade(ArrayList<Student> ar, double grade){
        for( Student s : ar) {
            if(s.avarage > grade){
                printStudent(s);
            }
        }
    }
    void testStuednts(ArrayList<Student> aL, StudentsChecks sc){
        for(Student s : aL){
            if(sc.testStudent(s)){
                printStudent(s);
            }
        }
    }
    void printStudentsUnderGrade(ArrayList<Student> ar, double grade){
        for( Student s : ar) {
            if(s.avarage < grade){
                printStudent(s);
            }
        }
    }
    void printStudentsOverAge(ArrayList<Student> ar, int age){
        for( Student s : ar) {
            if(s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> ar, int age){
        for( Student s : ar) {
            if(s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentBySex(ArrayList<Student> ar, char sex){
        for( Student s : ar) {
            if(s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> ar, double grade, int age, char sex){
        for( Student s : ar) {
            if(s.avarage > grade && s.age < age && s.sex == sex){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 21, 2, 6.4);
        Student st3= new Student("Elena", 'f', 25, 5, 7.8);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Marina", 'f', 23, 1, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo stInfo = new StudentInfo();
        FindStudentsOverGrade f = new FindStudentsOverGrade();
        FindStudentsUnderAge f1 = new FindStudentsUnderAge();



        stInfo.testStuednts(list,f1);
    }
}
interface StudentsChecks{
    boolean testStudent(Student s);
}
class FindStudentsOverGrade implements  StudentsChecks{
    public boolean testStudent(Student s){
        return s.avarage > 8.5;
    }

}
class FindStudentsUnderGrade implements  StudentsChecks{
    public boolean testStudent(Student s){
        return s.avarage < 8.5;
    }
}
class FindStudentsOverAge implements  StudentsChecks{
    public boolean testStudent(Student s){
        return s.age > 22;
    }
}
class FindStudentsUnderAge implements  StudentsChecks{
    public boolean testStudent(Student s){
        return s.age < 22;
    }
}