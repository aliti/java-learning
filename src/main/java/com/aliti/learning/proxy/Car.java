package com.aliti.learning.proxy;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Car implements Drivable{

    Driver driver;

    @Override
    public void drive() {
        System.out.println("Car being driven");
    }
}
