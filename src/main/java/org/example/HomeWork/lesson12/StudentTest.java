package org.example.HomeWork.lesson12;

import org.example.lesson11.Student;

public class StudentTest {
    public static void isStudentSame(Student s1, Student s2){
        if(s1==s2){
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }
    public static void isStudentSameNest(Student s1, Student s2){
        if(s1.name.equals(s2.name) && s1.course == s2.course && s1.garde == s2.garde){
            System.out.println("Studenti odinakovie");
        } else {
            System.out.println("Studenti ne ravni");
            if(!s1.name.equals(s2.name) ){
                System.out.println("U nich raznie Imena");
            } else if (s1.course != s2.course) {
                System.out.println("U nich raznie Coursi");
            } else {
                System.out.println("U nich raznie оценки");
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Igor", 2, 4.5);
        Student s2 = new Student("Igor", 2, 4.7);
        //isStudentSame(s1,s2);
        isStudentSameNest(s1,s2);
    }
}
