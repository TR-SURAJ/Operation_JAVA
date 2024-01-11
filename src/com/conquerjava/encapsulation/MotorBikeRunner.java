package com.conquerjava.encapsulation;


public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        // Ducati
        ducati.start();
        honda.start();

        ducati.increaseSpeed(100);
        honda.increaseSpeed((200));

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.decreaseSpeed(25);
        honda.decreaseSpeed((50));

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());


    }
}
