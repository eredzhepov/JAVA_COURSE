package org.example.Lesson3;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int i1 = 5;
        int i2 = 11;
        double d1=5.5;
        double d2=1.3;
        long l = 20l;
        double result = 0;
        System.out.println(d2%i1);
        result = i2/d1 + d2%i1 - l;
        System.out.println(result);



        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println(++b - b++ + ++b - --b);

    }
}
