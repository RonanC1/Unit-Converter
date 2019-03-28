package com.Labs;

public class Temp{
    private double fahrenheit;
    private double celsius;
    private double kelvin;


    public void convertFahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit-32)/1.8;
        this.kelvin = ((fahrenheit+459.67)*5/9);
    }

    public void convertCelsius(double celsius){
        this.celsius = celsius;
        this.fahrenheit = (celsius*1.8)+32;
        this.kelvin = celsius+273.15;
    }

    public void convertKelvin(double kelvin){
        this.kelvin = kelvin;
        this.celsius = kelvin-273.15;
        this.fahrenheit = (kelvin*(9/5))-459.67;
    }

    public double getFahrenheit(){
        return this.fahrenheit;
    }

    public double getCelsius(){
        return this.celsius;
    }

    public double getKelvin(){
        return this.kelvin;
    }
}
