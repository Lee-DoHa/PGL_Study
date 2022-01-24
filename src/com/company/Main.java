package com.company;

public class Main {

    public static void main(String[] args) {
        CarDriver driver = new CarDriver("name", 1);
        SimpleCar car = new SimpleCar();
        car.setDriver(driver);
    }
}
