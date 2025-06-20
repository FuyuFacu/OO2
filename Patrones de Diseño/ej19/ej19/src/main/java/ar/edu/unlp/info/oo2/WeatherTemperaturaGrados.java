package ar.edu.unlp.info.oo2;

public class WeatherTemperaturaGrados extends WeatherDecorator{


    public WeatherTemperaturaGrados(WeatherData component) {
        super(component);
    }


    public String displayData() {
        double conversion =  (super.getTemperatura()-32) / 1.8;
        return "Temperatura C: " + conversion
                + "; Presión atmosf: " + super.getPresion()
                + "; Radiación solar: " + super.getRadiacionSolar();
    }
}
