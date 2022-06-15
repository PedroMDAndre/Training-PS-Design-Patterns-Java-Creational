package pt.paterns.structural.bridge.movie;

import pt.paterns.structural.bridge.movie.formatter.Formatter;
import pt.paterns.structural.bridge.movie.formatter.PrintFormatter;
import pt.paterns.structural.bridge.movie.printer.MoviePrinter;
import pt.paterns.structural.bridge.movie.printer.Printer;

public class BridgePrintDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();

        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

    }

}
