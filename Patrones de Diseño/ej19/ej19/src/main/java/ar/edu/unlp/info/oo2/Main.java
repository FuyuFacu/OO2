package ar.edu.unlp.info.oo2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la estación base con datos de ejemplo
        WeatherData estacionBase = new HomeWeatherStation(
                86.0,       // Temperatura en °F
                1008.0,     // Presión atmosférica
                200.0,      // Radiación solar
                List.of(84.0, 86.0, 88.0)  // Historial de temperaturas
        );

        // --- Ejemplos del enunciado ---
        System.out.println("=== Ejemplo 1: Solo Fahrenheit (clase base) ===");
        System.out.println(estacionBase.displayData());
        // Output esperado: "Temperatura F: 86.0; Presión atmosf: 1008.0; Radiación solar: 200.0;"

        System.out.println("\n=== Ejemplo 2: Solo Celsius ===");
        WeatherData celsiusDecorator = new WeatherTemperaturaGrados(estacionBase);
        System.out.println(celsiusDecorator.displayData());
        // Output esperado: "Temperatura C: 30.0; Presión atmosf: 1008.0; Radiación solar: 200.0;"

        System.out.println("\n=== Ejemplo 3: Celsius + Promedio ===");
        WeatherData promCelsiusDecorator = new WeatherPromedio(celsiusDecorator);
        System.out.println(promCelsiusDecorator.displayData());
        // Output esperado: "Temperatura C: 30.0; Presión atmosf: 1008.0; Radiación solar: 200.0; Promedio: 30.0;"

        System.out.println("\n=== Ejemplo 4: Fahrenheit + Promedio ===");
        WeatherData promFahrenheitDecorator = new WeatherPromedio(estacionBase);
        System.out.println(promFahrenheitDecorator.displayData());
        // Output esperado: "Temperatura F: 86.0; Presión atmosf: 1008.0; Radiación solar: 200.0; Promedio: 86.0;"

        System.out.println("\n=== Ejemplo 5: Celsius + Mín/Máx ===");
        WeatherData minMaxCelsiusDecorator = new WeatherTempsMinYMax(celsiusDecorator);
        System.out.println(minMaxCelsiusDecorator.displayData());
        // Output esperado: "Temperatura C: 30.0; Presión atmosf: 1008.0; Radiación solar: 200.0; Mínimo: 27.0; Máximo: 32.0;"

        System.out.println("\n=== Ejemplo 6: Celsius + Mín/Máx (sin promedio) ===");
        // (Usamos el mismo decorador del Ejemplo 5)
        System.out.println(minMaxCelsiusDecorator.displayData());
        // Output igual al Ejemplo 5

        System.out.println("\n=== Ejemplo 7: Todos los decoradores combinados ===");
        WeatherData fullDecorator = new WeatherPromedio(minMaxCelsiusDecorator);
        System.out.println(fullDecorator.displayData());
        // Output esperado: "Temperatura C: 30.0; Presión atmosf: 1008.0; Radiación solar: 200.0; Mínimo: 27.0; Máximo: 32.0; Promedio: 30.0;"
    }
}