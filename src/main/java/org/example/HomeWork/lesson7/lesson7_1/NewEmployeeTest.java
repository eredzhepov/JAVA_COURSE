package org.example.HomeWork.lesson7.lesson7_1;

import org.example.HomeWork.lesson7.Employee;

public class NewEmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12, "Петров", 23, 543223, "IT");
        //Employee emp2 = new Employee(12, "Петров", 23, 543223);
        //Employee emp3 = new Employee(543223);
        emp1.showInfo();
    }
}
