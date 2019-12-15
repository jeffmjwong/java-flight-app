package com.pluralsight.flight;

public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    private boolean hasCargoSpace(float size) {
        return this.usedCargoSpace + size <= this.maxCargoSpace;
    }
}
