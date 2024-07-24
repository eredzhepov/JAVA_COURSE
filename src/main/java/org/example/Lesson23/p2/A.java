package org.example.Lesson23.p2;

public class A {
    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{

    void abc(B b){
        System.out.println("B");
    }
}
class C extends B{
    @Override
    void abc(B b){
        System.out.println("C");
    }
}
