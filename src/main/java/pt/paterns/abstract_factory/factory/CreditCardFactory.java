package pt.paterns.abstract_factory.factory;

import pt.paterns.abstract_factory.credit_card.CardType;
import pt.paterns.abstract_factory.credit_card.CreditCard;
import pt.paterns.abstract_factory.validator.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
