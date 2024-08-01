package org.example.Lesson26;

public class Test2 {
    void def(Object o) {
        System.out.println("Object");
    }
    void def(String o) {
        System.out.println("String");
    }
//    void ghi(int a, int b){
//        System.out.println("Hello1");
//    }
    void ghi(long a, long b){
        System.out.println("Hello2");
    }
    void ghi(Integer a, Integer b){
        System.out.println("Hello3");
    }
    void ghi(int...a){
        System.out.println("Hello4");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.def(new StringBuilder("rer"));
        t.ghi(1,3);
    }
}
