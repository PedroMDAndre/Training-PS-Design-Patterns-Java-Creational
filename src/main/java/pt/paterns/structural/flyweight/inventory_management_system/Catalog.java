package pt.paterns.structural.flyweight.inventory_management_system;

import java.util.HashMap;
import java.util.Map;

// Catalog acts as a Factory and Cache for Item flyweight objects
public class Catalog {
    private final Map<String, Item> items = new HashMap<>();

    // factory method
    public Item lookup(String itemName) {
        return items.computeIfAbsent(itemName, Item::new);
    }

    public int totalItemsMade() {
        return items.size();
    }

}
