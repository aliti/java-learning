package com.aliti.learning.proxy;

public class DemoProxy {

    // we can replace the interface with new behavior with less code change
    public static void main(String[] args) {
        Car car = new Car(new Driver(12));
        car.drive();


        car = new CarProxy(new Driver(12));
        car.drive();
    }
}
