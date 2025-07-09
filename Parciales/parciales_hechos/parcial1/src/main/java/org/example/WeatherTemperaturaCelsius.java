package org.example;

public class WeatherTemperaturaCelsius extends Weather {

	public String display() {
		return
			super.display() +
			super.convertirFarenACelcius(super.getTemperaturaFahrenheit());
	}
}