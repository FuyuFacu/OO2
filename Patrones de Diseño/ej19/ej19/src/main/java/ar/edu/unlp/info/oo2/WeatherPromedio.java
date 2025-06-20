package ar.edu.unlp.info.oo2;

import java.util.List;

public class WeatherPromedio extends WeatherDecorator{
    public WeatherPromedio(WeatherData component) {
        super(component);
    }

    public String displayData() {
        List<Double> temps = super.getTemperaturas();
        double promedio = temps.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);

        return super.displayData() + "; Promedio: " + promedio;
    }



}
