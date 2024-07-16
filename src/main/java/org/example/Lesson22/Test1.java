package org.example.Lesson22;

import org.example.HomeWork.lesson10.p1.p2.p3.p4.D;

public class Test1 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 45;

        doc.specialization = "xirurg";
        doc.eat();
        doc.spat();
        doc.lechit();

    }
}
class Employee{
    String name;
    int age;

    void eat(){
        System.out.println("Kushat");
    }
    void spat(){
        System.out.println("Spat");
    }
}
class Doctor extends Employee{
    String specialization;
    void lechit(){
        System.out.println("Lechit");
    }

    class Teacher extends  Employee{
        void uchit(){
            System.out.println("Uchit");
        }
    }

    class Driver extends Employee{
        void Vodit(){
            System.out.println("Vodit");
        }
    }
}
