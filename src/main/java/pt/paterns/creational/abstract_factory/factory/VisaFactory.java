package pt.paterns.creational.abstract_factory.factory;

import pt.paterns.creational.abstract_factory.credit_card.CardType;
import pt.paterns.creational.abstract_factory.credit_card.CreditCard;
import pt.paterns.creational.abstract_factory.credit_card.VisaBlackCreditCard;
import pt.paterns.creational.abstract_factory.credit_card.VisaGoldCreditCard;
import pt.paterns.creational.abstract_factory.validator.Validator;
import pt.paterns.creational.abstract_factory.validator.VisaValidator;

public class VisaFactory implements CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		return switch (cardType) {
			case GOLD -> new VisaGoldCreditCard();
			case PLATINUM -> new VisaBlackCreditCard();
		};

	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
