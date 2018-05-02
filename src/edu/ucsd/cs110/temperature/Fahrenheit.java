package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float) ((getValue() - 32)*(5.0/9.0)));
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue()) ;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(getValue()) + " F";
    }

}
