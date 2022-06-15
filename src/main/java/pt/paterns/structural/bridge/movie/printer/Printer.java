package pt.paterns.structural.bridge.movie.printer;

import pt.paterns.structural.bridge.movie.Detail;
import pt.paterns.structural.bridge.movie.formatter.Formatter;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected  abstract  String getHeader();

    protected abstract  List<Detail> getDetails();

}
