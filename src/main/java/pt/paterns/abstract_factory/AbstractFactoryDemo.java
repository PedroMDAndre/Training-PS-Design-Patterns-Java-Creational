package pt.paterns.abstract_factory;

import pt.paterns.abstract_factory.credit_card.CreditCard;
import pt.paterns.abstract_factory.factory.CreditCardFactory;

import static pt.paterns.abstract_factory.credit_card.CardType.*;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card1 = abstractFactory.getCreditCard(PLATINUM);
		
		System.out.println(card1.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(GOLD);
		
		System.out.println(card2.getClass());
	}

}
