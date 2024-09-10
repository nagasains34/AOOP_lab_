package com.Temperature;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        // Test cases
        double[] celsiusValues = {0, 100, -40, -273.15}; // Including absolute zero (-273.15°C)
        double[] fahrenheitValues = {32, 212, -40, -459.67}; // Including absolute zero (-459.67°F)

        System.out.println("Celsius to Fahrenheit conversions:");
        for (double celsius : celsiusValues) {
            System.out.printf("%.2f°C = %.2f°F%n", celsius, celsiusToFahrenheit(celsius));
        }

        System.out.println("\nFahrenheit to Celsius conversions:");
        for (double fahrenheit : fahrenheitValues) {
            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }
}
