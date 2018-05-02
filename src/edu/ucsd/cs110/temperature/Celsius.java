package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float) (1.8 * getValue()) + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(getValue()) + " C";
    }

}
