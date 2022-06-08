package pt.paterns.creational.factory.website;

import pt.paterns.creational.factory.page.CartPage;
import pt.paterns.creational.factory.page.ItemPage;
import pt.paterns.creational.factory.page.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
