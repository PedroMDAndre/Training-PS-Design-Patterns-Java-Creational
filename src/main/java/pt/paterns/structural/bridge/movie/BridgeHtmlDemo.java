package pt.paterns.structural.bridge.movie;

import pt.paterns.structural.bridge.movie.formatter.Formatter;
import pt.paterns.structural.bridge.movie.formatter.HtmlFormatter;
import pt.paterns.structural.bridge.movie.printer.MoviePrinter;
import pt.paterns.structural.bridge.movie.printer.Printer;

public class BridgeHtmlDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter htmlFormatter = new HtmlFormatter();

        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(printedMaterial);

    }

}
