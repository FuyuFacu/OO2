package ar.edu.unlp.info.oo2;

public class WeatherTemperaturaFarenheit extends WeatherDecorator{

    public WeatherTemperaturaFarenheit(WeatherData component) {
        super(component);
    }

    public String displayData() {
        return super.displayData();
    }
}
