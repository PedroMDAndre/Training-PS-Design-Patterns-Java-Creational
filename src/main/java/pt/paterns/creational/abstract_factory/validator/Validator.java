package pt.paterns.creational.abstract_factory.validator;

import pt.paterns.creational.abstract_factory.credit_card.CreditCard;

public interface Validator {
	boolean isValid(CreditCard creditCard);
}
