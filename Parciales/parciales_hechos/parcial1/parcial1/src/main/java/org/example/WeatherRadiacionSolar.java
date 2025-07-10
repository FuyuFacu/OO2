package org.example;

public class WeatherRadiacionSolar extends Weather {

	public String display() {
		return 
			super.display() +
			super.getRadiacionSolar();
	}
	
}