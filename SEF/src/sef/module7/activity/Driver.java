package sef.module7.activity;

import sef.module7.sample.Strategy;

public class Driver {


    private Moving driversMoving;
    private String name;


    public Driver(String name) {
        this.name = name;
    }
    public void setDriversMoving(Moving moving) {
       driversMoving = moving;
    }


    public void driverStartsDriving() {
        System.out.print("Driver " + name + " ");
        driversMoving.drive();
    }
}
