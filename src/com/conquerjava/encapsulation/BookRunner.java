package com.conquerjava.encapsulation;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfAlgorithms = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfAlgorithms.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);
    }
}
