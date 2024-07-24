package org.example.HomeWork.Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Igolka");
        System.out.println(mechenosec.name);
        mechenosec.swim();
        mechenosec.eat();
        mechenosec.sleep();
        Speakeable pingvin = new Pingvin("Lolo");
        pingvin.speack();

        Animal lev = new Lev("Simba");
        System.out.println(lev.name);
        lev.sleep();
        lev.eat();

        Mammal lev2 = new Lev("Muphasa");
        System.out.println(lev2.name);
        lev2.run();
        lev2.sleep();
        lev2.eat();
        lev2.speack();

    }
}
