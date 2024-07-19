package org.example.Lesson23;

public class Test1 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Xirurg();
        Doctor d2 = new Xirurg();

        //System.out.println(emp4.lechit());
    }
}
    class Employee{
        String name;
        int age;
        int expiriens;
        double salary;


        void eat(){
            System.out.println("Kushat");
        }
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
    class Xirurg extends Doctor {
        String skalpel;
        public void operatia(){
            System.out.println("Operatia");
        }
    }
        class Teacher extends Employee {
            int kolvoUchenikov;

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
