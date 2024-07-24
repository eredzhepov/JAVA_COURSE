package org.example.Lesson24;

public class Test3 {
}

class Employee implements Help_able{
    String name;
    int age;
    int expiriens;
    double salary;
    void eat() {
        System.out.println("Kushat");
    }
    void spat() {
        System.out.println("Spat");
    }
    public void pomosh(){
        System.out.println(1);
    };
    public void tushitPozhar(){
        System.out.println("d");
    };
    public static void main(String[] args) {
        Teacher e = new Teacher();
        e.tushitPozhar();
        Help_able d = new Driver();
        Help_able h = new Teacher();
        Help_able e123 = new Employee();
    }
}

class Teacher extends Employee implements Help_able{
    public void pomosh(){
        System.out.println("Оказывание 1-й медицынской помощи");
    }

    @Override
    public void tushitPozhar() {
        System.out.println("Тушение пожара");
    }

    int kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}
interface Help_able{
    void pomosh();
    void tushitPozhar();
}
interface  Swim_able{
    void swim();
}