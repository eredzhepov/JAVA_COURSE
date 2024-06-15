package org.example.lesson6;

public class Lesson6 {
    int summ() {
        System.out.println("Сумма равна 0");
        return 0;
    }

    int summ(int a, int b) {
        int result = a +b;
        System.out.println("Сумма чисел: " + a + " " + b + " равна " + result);
        return result;
    }

    int summ(int a, int b, int c) {
        int result = a +b+c;
        System.out.println("Сумма чисел: " + a + " " + b + " " + c + " равна " + result);
        return result;
    }

    int summ(int a, int b, int c, int d) {
        int result = a +b+c+d;
        System.out.println("Сумма чисел: " + a + " " + b + " " + c + " " + d + " равна " + result);
        return result;
    }

}
class Test6{
    public static void main(String[] args) {
        Lesson6 t = new Lesson6();
        t.summ();
        t.summ(1,3);
        t.summ(4,5,2);
        t.summ(6,2,3,4);
    }

}
