package pt.paterns.factory.website;

import pt.paterns.factory.page.AboutPage;
import pt.paterns.factory.page.CommentPage;
import pt.paterns.factory.page.ContactPage;
import pt.paterns.factory.page.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
