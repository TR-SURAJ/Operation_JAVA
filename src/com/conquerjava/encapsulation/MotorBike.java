package com.conquerjava.encapsulation;

public class MotorBike {
    private int speed; // member variable

    //behaviour
    int getSpeed() {
        return this.speed;
    }
    void setSpeed(int speed) { // local variable
        if(speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    void start() {
        System.out.println("Bike started");
    }
}
