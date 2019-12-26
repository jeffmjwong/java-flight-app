package com.pluralsight.flight;

public final class Passenger implements Comparable {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;
    public int memberLevel; // 3(1st priority), 2, 1
    public int memberDays;
    public String name;

    public int getCheckedBags() { return this.checkedBags; }
    public void setCheckedBags(int checkedBags) { this.checkedBags = checkedBags; }
    public int getFreeBags() { return this.freeBags; }
    public void setFreeBags(int freeBags) { this.freeBags = freeBags; }

    public void setLevelAndDays(int level, int days, String name) {
        this.memberLevel = level;
        this.memberDays = days;
        this.name = name;
    }

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

    @Override
    public int compareTo(Object o) {
        Passenger p = (Passenger) o;
        if (this.memberLevel > p.memberLevel) {
            return -1;
        } else if (p.memberLevel > this.memberLevel) {
            return 1;
        } else {
            if (this.memberDays > p.memberDays) {
                return -1;
            } else if (p.memberDays > this.memberDays) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
