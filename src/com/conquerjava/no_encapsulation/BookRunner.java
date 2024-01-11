package com.conquerjava.no_encapsulation;

public class BookRunner {

    public static void main(String[] args) {

        //Create three book instances
        Book artOfAlgorithms = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfAlgorithms.noOfCopies = 100;
        effectiveJava.noOfCopies = 50;
        cleanCode.noOfCopies = 45;

        artOfAlgorithms.read_book();
        effectiveJava.read_book();
        cleanCode.read_book();


    }
}
