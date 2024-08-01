package org.example.Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        Car c4 = new Car("black", "V8");
        ArrayList <Car> arr = new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(arr.contains(c4));
        System.out.println(c4.toString());
        System.out.println(c2);
        System.out.println(arr);

    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
        } else {
            return false;
        }

    }
    @Override
    public String toString(){
        return "Mashina cveta " + color + " i s motorom " + engine;
    }
}
