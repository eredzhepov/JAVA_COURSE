package org.example.Lesson16;

public class Test {
    public static void main(String[] args) {
        String s4 = "Hello";
        String s5 = "Hello";
        String s6 = new String("Hello");
        if (s4==s5){
            System.out.println("Адреса объектов равны");
        }
        if (s4==s6 && s5==s6){
            System.out.println("А эти не равны");
        }
    }
}
