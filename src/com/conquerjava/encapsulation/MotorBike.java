package com.conquerjava.encapsulation;

public class MotorBike {
    private int speed; // member variable

    //behaviour
    int getSpeed() {
        return this.speed;
    }
    void setSpeed(int speed) { // local variable
        System.out.println(speed); //100
        System.out.println(this.speed); //0
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike started");
    }
}
