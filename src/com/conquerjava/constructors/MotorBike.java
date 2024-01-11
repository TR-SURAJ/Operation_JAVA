package com.conquerjava.constructors;

public class MotorBike {
    private int speed; // member variable

    MotorBike() {
        this(5); // this invokes the constructor below
    }

    MotorBike(int speed) {
        this.speed =speed;
    }

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

