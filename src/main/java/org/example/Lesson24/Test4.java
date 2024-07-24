package org.example.Lesson24;

public class Test4 {
}
interface I2 {
    void abc();
    default void def(){
        System.out.println("Eto metod def");
    }
}
class Z2 implements I2{
    public void abc(){
        System.out.println("abc v klasse Z");
    }
}
interface I1{
    private static void method1(){
        System.out.println("Static me");
    }
    private void method2(){};
    default void abc(){
        System.out.println("Eto metod def");
    }
    static void def(){
        System.out.println("Eto metod def");
    }
}
abstract class O {}
class R extends O implements I1{
    I1 method1(I2 i){
        return new R();
    }
    static I1 method2(I1 i){
        return new D3();
    }

    public static void main(String[] args) {
        I1 i1 = new D3();
        method2(i1);
    }
}

class D3 implements I1{

}