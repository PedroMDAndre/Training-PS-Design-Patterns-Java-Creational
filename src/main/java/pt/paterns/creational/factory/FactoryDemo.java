package pt.paterns.creational.factory;

import pt.paterns.creational.factory.website.Website;
import pt.paterns.creational.factory.website.WebsiteFactory;

import static pt.paterns.creational.factory.website.WebsiteType.*;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(SHOP);

        System.out.println(site.getPages());
    }
}
