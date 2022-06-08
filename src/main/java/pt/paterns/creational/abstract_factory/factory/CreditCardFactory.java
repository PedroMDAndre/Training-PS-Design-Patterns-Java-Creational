package pt.paterns.creational.abstract_factory.factory;

import pt.paterns.creational.abstract_factory.credit_card.CardType;
import pt.paterns.creational.abstract_factory.credit_card.CreditCard;
import pt.paterns.creational.abstract_factory.validator.Validator;

//AbstractFactory
public interface CreditCardFactory {

	static CreditCardFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	CreditCard getCreditCard(CardType cardType);
		
	Validator getValidator(CardType cardType);
}
