package pt.paterns.abstract_factory.validator;

import pt.paterns.abstract_factory.credit_card.CreditCard;

public interface Validator {
	boolean isValid(CreditCard creditCard);
}
