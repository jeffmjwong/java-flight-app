package com.pluralsight.flight;

public final class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public int getCheckedBags() { return this.checkedBags; }
    public void setCheckedBags(int checkedBags) { this.checkedBags = checkedBags; }
    public int getFreeBags() { return this.freeBags; }
    public void setFreeBags(int freeBags) { this.freeBags = freeBags; }

    public Passenger() {}

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
