package org.example.HomeWork.lesson11;

import org.example.HomeWork.lesson10.p1.p2.p3.C;

public class Car {
   public String color;
   public String engine;
   public int doorCount;

    public Car(String color, String engine, int actualDoorCount) {
        this.color = color;
        this.engine = engine;
        doorCount = actualDoorCount;
    }

}
class CarTest{

    public static void changeCarDoorCount(Car newCar, int newDoorCount){
        newCar.doorCount = newDoorCount;
    }
    public static void swapCarColors(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        Car bmw = new Car("red","v6",4);
        Car lamborginy = new Car("blue","v8",2);
        swapCarColors(bmw, lamborginy);
        System.out.println(bmw.color);
        System.out.println(lamborginy.color);
        changeCarDoorCount(bmw,2);
        System.out.println(bmw.doorCount);
    }
}
