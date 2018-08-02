package com.example.lib_java8_lanmdba;

public class Car {
    public interface Supplier<T> {
        T get();
    }
    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }


    //create(Car::car)  == Supplier<Car> supplier = ()->return Car::new;
    public static Car create(Supplier<Car> supplier){
        return supplier.get();
    }

}
