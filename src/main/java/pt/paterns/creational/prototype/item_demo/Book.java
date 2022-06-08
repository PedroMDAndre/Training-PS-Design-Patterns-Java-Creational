package pt.paterns.creational.prototype.item_demo;

public class Book extends Item {

    private int numberOfPages;

    public Book() {
        // Empty constructor
        super();
    }

    public Book(Book target) {
        // Copy constructor
        super(target);
        this.numberOfPages = target.numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public Item copy() {
        return new Book(this);
    }
}
