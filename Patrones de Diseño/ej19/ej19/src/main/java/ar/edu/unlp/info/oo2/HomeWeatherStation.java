package ar.edu.unlp.info.oo2;

import java.util.Comparator;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double temperaturaf;
    private double presion_atmosferica;
    private double radiacion_solar;
    private List<Double> temperaturas;

    public HomeWeatherStation(double temperaturaf, double presion_atmosferica, double radiacion_solar, List<Double> temperaturas) {
        this.temperaturaf = temperaturaf;
        this.presion_atmosferica = presion_atmosferica;
        this.radiacion_solar = radiacion_solar;
        this.temperaturas = temperaturas;
    }

    public double getTemperatura() { return temperaturaf; }

    public double getPresion() { return presion_atmosferica; }

    //retorna la radiación solar
    public double getRadiacionSolar() { return radiacion_solar; }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    @Override
    public List<Double> getTemperaturas() {
        return temperaturas;
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() +
                "; Presión atmosf: " + this.getPresion() +
                "; Radiación solar: " + this.getRadiacionSolar();
    }




}
