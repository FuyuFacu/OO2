package org.example;
import java.util.List;

public class HomeWeatherStationAdapter implements IWeather {
	private HomeWeatherStation adaptee;

	public HomeWeatherStationAdapter(HomeWeatherStation adaptee) {
		this.adaptee = adaptee;
	}

	// retorna la temperatura en grados farenheit
	public double getTemperaturaFahrenheit() {
		return adaptee.getTemperaturaFahrenheit();
	}

	// Retorna la presion atmosferica de en hPa
	public double getPresion() {
		return adaptee.getPresion();
	}

	// retorna la radiacion solar
	public double getRadiacionSolar() {
		return adaptee.getRadiacionSolar();
	}

	// Retorna una lista con las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit() {
		return adaptee.getTemperaturasFahrenheit();
	}

	public String display() {
		return "";
	}
}