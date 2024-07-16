package org.example.HomeWork.Lesson22.p2;

import org.example.HomeWork.Lesson22.p1.Pet;

public class Dog extends Pet {
    public Dog(){
        this("Tom");
    }
    public Dog(String name){
        this.name = name;
        System.out.println("I am Dog and my name is: " + name);

    }
    public void playes(){
        System.out.println("Dog plays");
    }
}
