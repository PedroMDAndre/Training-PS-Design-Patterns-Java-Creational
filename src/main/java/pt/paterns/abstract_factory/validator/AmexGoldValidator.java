package pt.paterns.abstract_factory.validator;

import pt.paterns.abstract_factory.credit_card.CreditCard;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		// Only for illustration
		return false;
	}

}
