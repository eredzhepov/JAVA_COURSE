package org.example.HomeWork.lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
   private double salary;
    String department;

    public int getId() {
        System.out.println("Значение переменной id =" + id);
        return id;
    }

    public String getSurname() {
        System.out.println("Значение переменной surname =" + surname);
        return surname;
    }

    public double getSalary() {
        System.out.println("Значение переменной salary =" + salary);
        return salary;
    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    private Employee(double salary) {
        this.salary = salary;
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
        Employee emp1 = new Employee(12, "Петров", 23, 543223, "IT");
        Employee emp2 = new Employee(12, "Петров", 23, 543223);
        emp1.showInfo();
        emp2.showInfo();
        //Employee emp3 = new Employee(543223);
    }
}

