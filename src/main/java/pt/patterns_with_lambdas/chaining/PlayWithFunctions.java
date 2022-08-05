package pt.patterns_with_lambdas.chaining;

import pt.patterns_with_lambdas.chaining.function.Function;
import pt.patterns_with_lambdas.chaining.model.Meteo;

public class PlayWithFunctions {

    public static void main(String[] args) {

        Meteo meteo = new Meteo(20);

        Function<Meteo, Integer> readCelsius = Meteo::getTemperature;
        Function<Integer, Double> celsiusToFahrenheit = t -> t * 9d/5d + 32d;

        Function<Meteo, Double> readFahrenheit = readCelsius.andThen(celsiusToFahrenheit);

        System.out.println("Meteo in F " + celsiusToFahrenheit.apply(readCelsius.apply(meteo)));
        System.out.println("Meteo in F " + readFahrenheit.apply(meteo));

    }

}
