package org.example.Lesson23;

public class Test4 {
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal a = new Mouse();

        t.abc(a);
        a.getName();
    }
}
class Animal{
    void getName() {
        System.out.println("Animal");
    }
}
class Mouse extends Animal {
    @Override
    void getName(){
        System.out.println("Mouse");
    }
}