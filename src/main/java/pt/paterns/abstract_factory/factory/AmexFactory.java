package pt.paterns.abstract_factory.factory;

import pt.paterns.abstract_factory.credit_card.AmexGoldCreditCard;
import pt.paterns.abstract_factory.credit_card.AmexPlatinumCreditCard;
import pt.paterns.abstract_factory.credit_card.CardType;
import pt.paterns.abstract_factory.credit_card.CreditCard;
import pt.paterns.abstract_factory.validator.AmexGoldValidator;
import pt.paterns.abstract_factory.validator.AmexPlatinumValidator;
import pt.paterns.abstract_factory.validator.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {

		return switch (cardType) {
			case GOLD -> new AmexGoldCreditCard();
			case PLATINUM -> new AmexPlatinumCreditCard();
		};
	}

	@Override
	public Validator getValidator(CardType cardType) {

		return switch (cardType) {
			case GOLD -> new AmexGoldValidator();
			case PLATINUM -> new AmexPlatinumValidator();
		};
	}
}
