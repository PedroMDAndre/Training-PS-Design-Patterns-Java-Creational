package pt.paterns.behavioral.strategy.credit_card.strategy;

import pt.paterns.behavioral.strategy.credit_card.CreditCard;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        String cardNumber = creditCard.getNumber();

        boolean isValid = cardNumber.startsWith("4");

        if (isValid) {
            isValid = cardNumber.length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(cardNumber);
        }

        return isValid;
    }

}
