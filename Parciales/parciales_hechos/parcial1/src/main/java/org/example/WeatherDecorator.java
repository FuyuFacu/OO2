package org.example;

import java.util.List;

public abstract class WeatherDecorator {
	private IWeather component;

	public double getTemperaturaFahrenheit() {
		return component.getTemperaturaFahrenheit();
	}

	public double getPresion() {
		return component.getPresion();
	}

	public double getRadiacionSolar() {
		return component.getRadiacionSolar();
	}

	public List<Double> getTemperaturasFahrenheit() {
		return component.getTemperaturasFahrenheit();
	}

	public double convertirFarenACelcius(double F) {
		return (F - 32) + 1.8;
	}

	public String display() {
		return this.component.display();
	}

}