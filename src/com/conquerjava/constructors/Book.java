package com.conquerjava.constructors;

public class Book {

    private int noOFCopies;

    public Book(int noOFCopies) {
        this.noOFCopies = noOFCopies;
    }

    public void setNoOfCopies(int noOfCopies){
        if(noOfCopies > 0)
            this.noOFCopies = noOfCopies;
    }

    int getNoOFCopies(){
        return this.noOFCopies;
    }

    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOFCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOFCopies - howMuch);
    }
}
