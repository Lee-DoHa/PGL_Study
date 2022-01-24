package com.company;

public class AnotherCar {
    private CarDriver driver;
    private int gear;
    private int velocity;

    public AnotherCar() {
    }

    public AnotherCar(CarDriver driver, int gear, int velocity) {
        this.driver = driver;
        this.gear = gear;
        this.velocity = velocity;
    }

    public CarDriver getDriver() {
        return driver;
    }

    public void setDriver(CarDriver driver) {
        this.driver = driver;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
