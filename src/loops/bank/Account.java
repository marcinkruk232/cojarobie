package loops.bank;

import java.math.BigDecimal;

public abstract class Account {

    private Integer accountID;

    private BigDecimal balance;

    private String currency = "USD";
    // usd to default value

    private Customer customer;
    //link to the owner of the account

    //ppm generate constructor i wszystko oprócz currency

    public Account(Integer accountID, Double balance, String currency, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2);
        this.currency = currency;
        this.customer = customer;
    }

    //tutaj na gorze mozemy dac currency jeszcze, jest deafult


    public Account(Integer accountID, double balance, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2);
        this.customer = customer;
    }

    // generate getter and setter
    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //generate tostring, troche modyfikujemy

    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("Account", " ") + "Acc{" +
                "ID=" + accountID +
                ", balance=" + balance +
                " " + currency + '\'' +
                ", customer=" + customer.getCustomerID() +
                '}';


        ////////OOOO JAK WCISNIEMY CTRL TO WIDZIMY ARGUMENTY FUNCKJI
    }
}
