package pt.paterns.structural.bridge.movie.formatter;

import pt.paterns.structural.bridge.movie.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<table>\n");
        stringBuilder.append("\t<th>");
        stringBuilder.append("Classification");
        stringBuilder.append("</th>\n");
        stringBuilder.append("\t<th>");
        stringBuilder.append(header);
        stringBuilder.append("</th>\n");

        for (Detail detail : details) {
            stringBuilder.append("\t<tr>\n\t\t<td>");
            stringBuilder.append(detail.label());
            stringBuilder.append("</td>\n\t\t<td>");
            stringBuilder.append(detail.value());
            stringBuilder.append("</td>\n\t</tr>\n");
        }

        stringBuilder.append("</table>");

        return stringBuilder.toString();

    }

}
