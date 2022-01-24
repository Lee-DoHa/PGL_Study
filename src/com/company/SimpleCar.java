package com.company;

public class SimpleCar {

    private CarDriver driver;
    private int valocity;

    public SimpleCar() {
    }

    public CarDriver getDriver() {
        return driver;
    }

    public void setDriver(CarDriver driver) {
        this.driver = driver;
    }

    public int getValocity() {
        return valocity;
    }

    public void setValocity(int valocity) {
        this.valocity = valocity;
    }

    public SimpleCar(CarDriver driver, int valocity) {
        this.driver = driver;
        this.valocity = valocity;
    }

    public void accelerate(){
        this.valocity += 10;
    }

    public void brake(){
        this.valocity -= 10;
    }

}
