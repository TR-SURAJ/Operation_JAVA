package com.conquerjava.constructors;



public class BookRunner {
    public static void main(String[] args) {
        Book artOfAlgorithms = new Book(1000);
        Book effectiveJava = new Book(500);
        Book cleanCode = new Book(400);

        artOfAlgorithms.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);

        artOfAlgorithms.increaseNoOfCopies(50);
        System.out.println(artOfAlgorithms.getNoOFCopies());
    }
}
