package ar.edu.unlp.info.oo2;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData{
    WeatherData component;

    public WeatherDecorator(WeatherData component) {
        this.component = component;
    }

    public double getTemperatura() {
        return component.getTemperatura();
    }

    public List<Double> getTemperaturas() {
        return component.getTemperaturas();
    }

    public double getPresion() {
        return component.getPresion();
    }

    public double getRadiacionSolar() {
        return component.getRadiacionSolar();
    }

    public String displayData() {
        return component.displayData();
    }




}
