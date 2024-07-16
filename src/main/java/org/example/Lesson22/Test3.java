package org.example.Lesson22;

public class Test3 {
}
class Human3 {
    String name;
    String surName;

    public Human3(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public Human3(String n){
        this(n, null);
    }
}
class Student3 extends Human3{
    Student3(){
        super("Pety");
    }

    public static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.name);
    }
}
