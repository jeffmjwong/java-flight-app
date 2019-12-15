package com.pluralsight.flight;

public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public float getUsedCargoSpace() { return this.usedCargoSpace; }

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public final void add1Package(float h, float w, float d) {
        float size = h * w * d;

        if (this.hasCargoSpace(size)) {
            this.usedCargoSpace += size;
        } else {
            this.handleNoSpace();
        }
    }

    private boolean hasCargoSpace(float size) {
        return this.usedCargoSpace + size <= this.maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space!!");
    }
}
