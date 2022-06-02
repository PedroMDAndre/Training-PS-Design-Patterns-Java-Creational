package pt.paterns.factory.website;

public class WebsiteFactory {

    private WebsiteFactory() {
        // To hide implicit public constructor
    }

    public static Website getWebsite(WebsiteType siteType) {
        return switch (siteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
        };
    }

}
