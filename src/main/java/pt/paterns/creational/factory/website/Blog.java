package pt.paterns.creational.factory.website;

import pt.paterns.creational.factory.page.AboutPage;
import pt.paterns.creational.factory.page.CommentPage;
import pt.paterns.creational.factory.page.ContactPage;
import pt.paterns.creational.factory.page.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
