package com.conquerjava.constructors;



public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        MotorBike hayabusa = new MotorBike(); // Java provides default constructor

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(hayabusa.getSpeed());

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
