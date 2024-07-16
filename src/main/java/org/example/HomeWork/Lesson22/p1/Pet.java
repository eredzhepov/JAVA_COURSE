package org.example.HomeWork.Lesson22.p1;

import org.example.HomeWork.Lesson22.Animal;

public class Pet extends Animal {

    protected String name;
    int tail = 1;
    private int paw = 4;
    public Pet(){
        System.out.println("I am a Pet");
        eyes = 2;
    }
    public void jumps(){
        System.out.println("Pet jumps");
    }
    public void runs(){
        System.out.println("Pet runs");
    }

    public int getPaw() {
        return paw;
    }
}
