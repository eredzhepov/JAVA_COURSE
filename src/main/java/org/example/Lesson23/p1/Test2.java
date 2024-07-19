package org.example.Lesson23.p1;


import org.example.HomeWork.lesson10.p1.p2.p3.p4.p5.E;

public class Test2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Teacher t = new Teacher();
        e.eat();
        t.eat();
    }
}
class Eda{

}
class Fructi extends Eda{

}
class Employee{
    Eda eat(){
        System.out.println("Kushat rabotnik");
        Eda e = new Eda();
        return e;
    }
    String name;
    int age;
    int expiriens;
    double salary;



    void spat(){
        System.out.println("Spat");
    }
}
class Doctor extends Employee {
    String specialization;

    void lechit() {
        System.out.println("Lechit");
    }
}
class Teacher extends Employee {
    int kolvoUchenikov;

    Eda eat(){
        System.out.println("Kushat uchitel");
        Fructi f = new Fructi();
        return f;
    }

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;
    void vodit(){
        System.out.println("Vodit");
    }
}
