package org.example.Lesson29.lambdas2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
}

class Car {
    String model;
    double engine;
    String color;

    public Car(String model, double engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String toString() {
        return "Our car is " + model + " color is " + color + " and engine " + engine;
    }
}

class Test10 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nisan Tiida", 1.6, "Silver"));
        System.out.println(ourCars);
        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Updatet car: " + car);
        });
        System.out.println(ourCars);
    }
}
