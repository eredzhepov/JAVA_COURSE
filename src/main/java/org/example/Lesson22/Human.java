package org.example.Lesson22;

public class Human {
    protected String name;
    static int salary;
    void work(){
        System.out.println("Work");
    }
    protected static void rest(){
        System.out.println("Rest");
    }

}
class Student1 extends Human{
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "Kolya";
        int sal = Student1.salary;
        s.work();
        Student1.rest();
    }
}
