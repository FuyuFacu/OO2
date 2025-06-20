package ar.edu.unlp.info.oo2;

import java.util.Comparator;
import java.util.List;

public class WeatherTempsMinYMax extends WeatherDecorator{

    public WeatherTempsMinYMax(WeatherData component) {
        super(component);
    }

    public String displayData() {
        double minimo = getMinimo(super.getTemperaturas());
        double maximo = getMaximo(super.getTemperaturas());
        return super.displayData() + "Minimo: " + minimo + " Maximo: " + maximo;
    }


    public static double getMinimo(List<Double> temps) {
        return temps.stream()
                .min(Comparator.comparingDouble(Double::doubleValue))
                .orElse(Double.NaN);
    }

    public static double getMaximo(List<Double> temps) {
        return temps.stream()
                .max(Comparator.comparingDouble(Double::doubleValue))
                .orElse(Double.NaN);
    }




}
