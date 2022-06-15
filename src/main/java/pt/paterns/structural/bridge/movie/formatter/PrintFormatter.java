package pt.paterns.structural.bridge.movie.formatter;

import pt.paterns.structural.bridge.movie.Detail;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header);
        stringBuilder.append("\n");

        for (Detail detail : details) {
            stringBuilder.append(detail.label());
            stringBuilder.append(":");
            stringBuilder.append(detail.value());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();

    }

}
