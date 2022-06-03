package pt.paterns.prototype.item_demo;

import java.util.HashMap;
import java.util.Map;

import static pt.paterns.prototype.item_demo.ItemType.BOOK;
import static pt.paterns.prototype.item_demo.ItemType.MOVIE;

public class Registry {

    private final Map<ItemType, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(ItemType itemType) {
        return items.get(itemType).copy();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(4.99);
        movie.setRuntime("2 hours");
        items.put(MOVIE, movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(10.99);
        book.setNumberOfPages(335);
        items.put(BOOK, book);
    }
}
