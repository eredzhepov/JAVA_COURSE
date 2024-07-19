package org.example.HomeWork.Lesson23.Test3;

public class X {
    private boolean abc(){
        return false;
    };
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.abc());
    }
}
class Y extends X{
    public boolean abc(){
        return true;
    }


}
