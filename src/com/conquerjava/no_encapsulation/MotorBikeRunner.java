package com.conquerjava.no_encapsulation;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.speed = 20;
        honda.speed = 0;
    }
}
