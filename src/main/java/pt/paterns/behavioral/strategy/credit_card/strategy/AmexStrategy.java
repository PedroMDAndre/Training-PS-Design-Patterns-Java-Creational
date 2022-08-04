package pt.paterns.behavioral.strategy.credit_card.strategy;

import pt.paterns.behavioral.strategy.credit_card.CreditCard;

public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        String cardNumber = creditCard.getNumber();

        boolean isValid = cardNumber.startsWith("37") ||
                cardNumber.startsWith("34");

        if (isValid) {
            isValid = cardNumber.length() == 15;
        }

        if (isValid) {
            isValid = passesLuhn(cardNumber);
        }

        return isValid;
    }

}
