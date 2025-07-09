package org.example;

public class WeatherPresion extends Weather {

	public String display() {
		return 
			super.display() +
			super.getPresion();
	}
}