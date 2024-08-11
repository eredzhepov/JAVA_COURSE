package org.example.HomeWork.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee{
    public void printEmployee(Employee e){
        System.out.println("Rabotnik " + e.name + " отдел " + e.department + " с зарплатой " + e.salary);
    }
    public void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> e) {
        for(Employee emp : aL){
            if(e.test(emp)){
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Egor", "Zavod", 350);
        Employee e2 = new Employee("Tatyana", "Buhalteriya", 180);
        Employee e3 = new Employee("Gosha", "Slesar", 220);
        Employee e4 = new Employee("Sweya", "Sweya", 210);
        Employee e5 = new Employee("Ron", "IT", 270);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        TestEmployee te = new TestEmployee();

        te.filtraciyaRabotnikov(list, x -> (x.department).equals("IT") && x.salary > 200);
        te.filtraciyaRabotnikov(list, x -> (x.name).startsWith("E") && x.salary != 450);
        te.filtraciyaRabotnikov(list, x -> (x.name).equals(x.department) );

    }
}
