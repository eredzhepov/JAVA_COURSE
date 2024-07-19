package org.example.Lesson23;

public class Test10 {
}
class A10{
    String s1 = "priver";
    static double PI = 3.14;
    int summa(int ... i){
        int result =0;
        for(int a : i){
            result+=a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}
class B10 extends A10{
    String s2 = super.s1 + "drug";
    @Override
    int summa(int ... i){
        int result = super.summa(i);
        System.out.println(result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
        System.out.println("b" + 1);
    }
}