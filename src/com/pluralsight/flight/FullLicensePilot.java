package com.pluralsight.flight;

public class FullLicensePilot extends Pilot {
    @Override
    public boolean canAccept(Flight flight) {
        return true;
    }
}
