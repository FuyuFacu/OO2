package org.example;

import java.util.List;

public class HomeWeatherStation {
	private List<Double> temperaturasFahrenheit;

	// Esta clase se encuentra implementada por terceros Y NO SE PUEDE MODIFICAR

	// retorna la temperatura en grados farenheit
	public double getTemperaturaFahrenheit() {
		return 0;
	}

	// Retorna la presion atmosferica de en hPa
	public double getPresion() {
		return 8;
	}

	// retorna la radiacion solar
	public double getRadiacionSolar() {
		return 20;
	}

	// Retorna una lista con las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit() {
		return temperaturasFahrenheit;
	}



}