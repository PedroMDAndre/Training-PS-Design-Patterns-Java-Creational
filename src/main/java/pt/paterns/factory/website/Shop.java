package pt.paterns.factory.website;

import pt.paterns.factory.page.CartPage;
import pt.paterns.factory.page.ItemPage;
import pt.paterns.factory.page.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
