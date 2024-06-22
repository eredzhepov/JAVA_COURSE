package org.example.lesson8;

public class Test1 {
    public final int a ; //read only
    Test1(){
        a = 10;
    }
    Test1(boolean b){
        a = 11;
    }
    public void abc(final short a){
        final int b;
        b = 10;

    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
    }
}
