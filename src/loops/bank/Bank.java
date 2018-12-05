package loops.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //noo yyy bank musi miec list of customers
    private List<Customer> custList = new ArrayList<>();

    private List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 100;

    //public API

    //to, co chcielibysmy pokazać userowi
    public Customer newCustomer(String firstName, String lastName, String email) {
        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType) {
        Account acc;
        switch (accType) {
            case "Savings":
                acc = new SavingsAccount(lastAccID++, 0.0, cust);
                break;
            case "Debit":
                acc = new DebitAccount(lastAccID++, 0.0, cust);
                break;
            default:
                acc = new CheckingAccount(lastAccID++, 0.0, cust);

        }
        accList.add(acc);
        return acc;
    }
}
