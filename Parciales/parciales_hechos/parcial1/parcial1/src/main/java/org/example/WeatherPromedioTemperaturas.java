package org.example;

public class WeatherPromedioTemperaturas extends Weather {

	public String display() {
		return
			super.display() +
			super.getTemperaturasFahrenheit()
				.stream()
				.mapToDouble(Double::doubleValue)
				.average();
	}
	
}