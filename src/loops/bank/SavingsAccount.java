package loops.bank;

public class SavingsAccount extends Account {
    public SavingsAccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
        // to super to takie odniesienie do Account
    }

    public SavingsAccount(Integer accountID, double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
