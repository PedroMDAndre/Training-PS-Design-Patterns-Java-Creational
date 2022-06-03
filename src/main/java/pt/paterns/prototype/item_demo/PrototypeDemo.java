package pt.paterns.prototype.item_demo;

import static pt.paterns.prototype.item_demo.ItemType.MOVIE;

public class PrototypeDemo {
    public static void main(String[] args) {
        var registry = new Registry();

        var movie = (Movie) registry.createItem(MOVIE);
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getRuntime());

        var anotherMovie = (Movie) registry.createItem(MOVIE);
        anotherMovie.setTitle("Lord of the Rings");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getRuntime());

    }

}
