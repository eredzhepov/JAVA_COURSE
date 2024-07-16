package org.example.HomeWork.Lesson22.p2;

import org.example.HomeWork.Lesson22.p1.Pet;

public class Cat extends Pet {
    public Cat(){
        this("Nord");
    }
    public Cat(String name){
        this.name = name;
        System.out.println("I am Cat and my name is: " + name);

    }
    public void sleeps(){
        System.out.println("Cat sleeps");
    }
}
