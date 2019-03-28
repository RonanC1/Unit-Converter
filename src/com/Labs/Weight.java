package com.Labs;

public class Weight {
    private double pounds;
    private double kgs;

    public void convertKgs(double kgs) {
        this.kgs = kgs;
        this.pounds = kgs*2.20462;
    }

    public void convertPounds(double pounds) {
        this.pounds = pounds;
        this.kgs = pounds/2.20462;
    }

    public double getKgs() {
        return kgs;
    }

    public double getPounds() {
        return pounds;
    }



}
