package pt.paterns.creational.prototype.item_demo;

public class Movie extends Item {

    private String runtime;

    public Movie() {
        // Empty constructor
        super();
    }

    public Movie(Movie target) {
        // Copy constructor
        super(target);
        this.runtime = target.runtime;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public Item copy() {
        return new Movie(this);
    }
}
