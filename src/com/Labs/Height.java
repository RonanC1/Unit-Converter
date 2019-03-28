package com.Labs;

public class Height {
    private double cm;
    private double inch;

    public void convertCm(double cm) {
        this.cm = cm;
        this.inch = cm/2.54;
    }

    public void convertInches(double inch) {
        this.inch = inch;
        this.cm = inch*2.54;
    }

    public double getCm() {
        return cm;
    }

    public double getInches() {
        return inch;
    }


}
