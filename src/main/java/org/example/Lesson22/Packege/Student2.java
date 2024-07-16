package org.example.Lesson22.Packege;

import org.example.Lesson22.Human2;


public class Student2 extends Human2 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.name = "Kolya";
        int sal = Student2.salary;
        s.work();
        Student2.rest();
        Human2 h = new Human2(); // не объект наследника, поэтому нельзя использовать
        Human2.rest(); // исключение статик элементы
        //h.work();
    }
}
