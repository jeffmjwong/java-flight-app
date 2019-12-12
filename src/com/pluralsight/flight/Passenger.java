package com.pluralsight.flight;

public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public int getCheckedBags() { return this.checkedBags; }
    public void setCheckedBags(int checkedBags) { this.checkedBags = checkedBags; }
    public int getFreeBags() { return this.freeBags; }
    public void setFreeBags(int freeBags) { this.freeBags = freeBags; }

    public Passenger() {}

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }
}
