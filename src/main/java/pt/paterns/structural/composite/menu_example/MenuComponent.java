package pt.paterns.structural.composite.menu_example;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    protected String name;
    protected String url;
    protected final List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    @Override
    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.append(": ")
                .append(url)
                .append("\n")
                .toString();
    }

}
