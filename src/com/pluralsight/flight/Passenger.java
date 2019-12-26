package com.pluralsight.flight;

public final class Passenger extends Person implements Comparable<Passenger> {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public static class RewardProgram {
        private int memberLevel = 1; // 3(1st priority), 2, 1
        private int memberDays;

        public int getMemberLevel() {
            return this.memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return this.memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }

    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return this.rewardProgram;
    }

    public int getCheckedBags() { return this.checkedBags; }
    public void setCheckedBags(int checkedBags) { this.checkedBags = checkedBags; }
    public int getFreeBags() { return this.freeBags; }
    public void setFreeBags(int freeBags) { this.freeBags = freeBags; }

    public Passenger() {}

    public Passenger(String name) {
        super(name);
    }

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

    public int compareTo(Passenger p) {
        if (this.getRewardProgram().getMemberLevel() > p.getRewardProgram().getMemberLevel()) {
            return -1;
        } else if (p.getRewardProgram().getMemberLevel() > this.getRewardProgram().getMemberLevel()) {
            return 1;
        } else {
            if (this.getRewardProgram().getMemberDays() > p.getRewardProgram().getMemberDays()) {
                return -1;
            } else if (p.getRewardProgram().getMemberDays() > this.getRewardProgram().getMemberDays()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
