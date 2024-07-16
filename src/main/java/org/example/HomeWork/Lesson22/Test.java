package org.example.HomeWork.Lesson22;

import org.example.HomeWork.Lesson22.p2.Cat;
import org.example.HomeWork.Lesson22.p2.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getPaw());
        Cat cat = new Cat();

        cat.sleeps();
    }
}
