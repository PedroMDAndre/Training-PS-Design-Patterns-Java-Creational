package pt.paterns.factory;

import pt.paterns.factory.website.Website;
import pt.paterns.factory.website.WebsiteFactory;

import static pt.paterns.factory.website.WebsiteType.*;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(SHOP);

        System.out.println(site.getPages());
    }
}
