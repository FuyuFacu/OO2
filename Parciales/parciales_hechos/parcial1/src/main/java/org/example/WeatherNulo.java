package org.example;
import java.util.Collections;
import java.util.List;


public class WeatherNulo implements IWeather {

    // retorna la temperatura en grados farenheit
    public double getTemperaturaFahrenheit() {
        return 0;
    }

    // Retorna la presion atmosferica de en hPa
    public double getPresion() {
        return 0;
    }

    // retorna la radiacion solar
    public double getRadiacionSolar() {
        return 0;
    }

    // Retorna una lista con las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturasFahrenheit() {
        return Collections.emptyList();
    }

    public String display() {
        return "";
    }
}
