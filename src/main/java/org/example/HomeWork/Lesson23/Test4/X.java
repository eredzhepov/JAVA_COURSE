package org.example.HomeWork.Lesson23.Test4;

public class X {
}
class Y extends X{
    public static void abc(X x, Y y){
        System.out.println("privet");
    };
    public static void abc(Y y, X x){
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Y a = new Y();
        //a.abc(a,a);
    }

}
