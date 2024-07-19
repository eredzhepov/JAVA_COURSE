package org.example.Lesson23;

public class Test6 {
}
class Animal1{
     String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of Animal " + showName());
    }
}
class Mouse1 extends Animal1{

     String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse " + showName());
    }

    public static void main(String[] args) {
        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
