package org.example.HomeWork.lesson9;

public class Test1 {
    int a =1;
    static int z = 2;
    static int b = 2;
    static void abc(final int a ){
        System.out.println(a);
        System.out.println(Test1.b);
    }
    public static void main(String[] args) {
        abc(5);
    }

}
