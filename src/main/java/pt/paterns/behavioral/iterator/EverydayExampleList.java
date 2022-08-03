package pt.paterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EverydayExampleList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            namesIterator.remove();
        }

        System.out.println("Names size: " + names.size());
    }

}
