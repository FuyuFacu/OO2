package org.example;

import java.util.List;

public interface IWeather {

	public double getTemperaturaFahrenheit();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturasFahrenheit();
	public String display();
}