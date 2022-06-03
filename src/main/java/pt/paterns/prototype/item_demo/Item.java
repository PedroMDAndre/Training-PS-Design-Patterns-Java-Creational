package pt.paterns.prototype.item_demo;

public abstract class Item {

    private String title;
    private double price;
    private String url;

    protected Item() {
        // Empty constructor
    }

    protected Item(Item target) {
        this.title = target.title;
        this.price = target.price;
        this.url = target.url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public abstract Item copy();
}
