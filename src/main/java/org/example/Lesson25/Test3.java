package org.example.Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Doctor d1 = (Doctor) emp1;

        d1.lechit();
        System.out.println(d1.specialization);
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
class Doctor extends Employee {
    String specialization = "Hirurg";

    void lechit() {
        System.out.println("Lechit");
    }

    class Teacher extends Employee {
        void uchit() {
            System.out.println("Uchit");
        }
    }

    class Driver extends Employee {
        void Vodit() {
            System.out.println("Vodit");
        }
    }
}
