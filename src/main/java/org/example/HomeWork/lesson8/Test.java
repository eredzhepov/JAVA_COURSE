package org.example.HomeWork.lesson8;

public class Test {
    public static double powerNumbers(double a, double b, double c){
        return a * b*c;
    }
    public static void devineNumbers(double a, double b){
        System.out.println("Если поделить " + a + " на " + b + " то получим " + a/b);;
    }
}
class TestTest {
    public static void main(String[] args) {
        System.out.println(Test.powerNumbers(3,4,5));
        System.out.println(Test.powerNumbers(5,6,3.3));
        Test.devineNumbers(5,5);
        Test.devineNumbers(81,9);
    }
}
