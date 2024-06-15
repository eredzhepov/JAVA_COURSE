package org.example.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public double increaseSalaryPoweredBy2(){
        return salary = salary*2;
    }
    public void showInfo(){
        System.out.println("Работник " + surname + " зарплата - " + salary );
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Petrov",42, 22312, "Economist");
        Employee emp2 = new Employee(2,"Ivanov",34, 12342, "Buchalter");
        emp1.increaseSalaryPoweredBy2();
        emp1.showInfo();
        emp2.increaseSalaryPoweredBy2();
        emp2.showInfo();
    }
}
