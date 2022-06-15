package pt.paterns.structural.bridge.movie.formatter;

import pt.paterns.structural.bridge.movie.Detail;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);

}
