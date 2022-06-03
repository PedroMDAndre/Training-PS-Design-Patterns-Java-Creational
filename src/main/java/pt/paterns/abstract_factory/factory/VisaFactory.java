package pt.paterns.abstract_factory.factory;

import pt.paterns.abstract_factory.credit_card.CardType;
import pt.paterns.abstract_factory.credit_card.CreditCard;
import pt.paterns.abstract_factory.credit_card.VisaBlackCreditCard;
import pt.paterns.abstract_factory.credit_card.VisaGoldCreditCard;
import pt.paterns.abstract_factory.validator.Validator;
import pt.paterns.abstract_factory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

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
