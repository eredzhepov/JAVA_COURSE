package org.example.HomeWork.Lesson24;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    public Fish(String name) {
        super(name);
        this.name = name;
    }
    abstract void swim();

    public void sleep(){
        System.out.println("Vsegda interesno nabludat kak spyat ribi");
    }

}
class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    public void swim(){
        System.out.println("Mechenosec krasivaya riba i ochen bistro plavaet");
    }
    public void eat(){
        System.out.println("Mechenosec ne hishnaya riba i est ribiy korm");
    }
}
abstract class Bird extends Animal implements Speakeable{
    public Bird(String name) {
        super(name);
    }
    abstract void fly();
    public void speack() {
        System.out.println(name + "sings");
    }
}
class Pingvin extends Bird {
    public Pingvin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pingvini lubit est ribu");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prrizhavshis drug k drugu");
    }

    @Override
    public void fly() {
        System.out.println("Pingvi ne umeet letat");
    }

    @Override
    public void speack() {
        System.out.println("Pingvin ne umeet pet kak solovey");
    }
}
abstract class Mammal extends Animal implements Speakeable{
    public Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
class Lev extends Mammal{

    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lev kakl uboi hishnik lubit myaso");
    }

    @Override
    public void sleep() {
        System.out.println("Bolsuyu chast dnya Lev spit");
    }

    @Override
    public void run() {
        System.out.println("Lev eto ne samaya bistraya koshka");
    }
}
interface Speakeable{
    default void speack(){
        System.out.println("Somebody speack");
    }
}
