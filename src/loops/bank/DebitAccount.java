package loops.bank;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    //generate both constructors

    public DebitAccount(Integer accountID, BigDecimal balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public DebitAccount(Integer accountID, BigDecimal balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
