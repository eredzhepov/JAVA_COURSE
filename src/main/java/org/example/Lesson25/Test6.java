package org.example.Lesson25;

public class Test6 implements interface1,interface2{
    public void abc(){
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(((interface2)t).a);
        ((interface1)t).abc();
    }
}
interface interface1{
    int a = 5;
    void abc();
}
interface  interface2{
    int a = 10;
    void abc();
}
