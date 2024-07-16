package org.example.HomeWork.Lesson22;

public class Animal {
    protected int eyes;
    public Animal(){
        this("I am animal");
    }
    public Animal(String s){
        System.out.println(s);
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drinks");
    }
}
