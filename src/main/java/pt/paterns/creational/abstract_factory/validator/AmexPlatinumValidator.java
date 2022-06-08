package pt.paterns.creational.abstract_factory.validator;

import pt.paterns.creational.abstract_factory.credit_card.CreditCard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		// Only for illustration
		return false;
	}

}
