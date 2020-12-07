package banking.current;

import banking.Accounts;

public class CurrentAccount extends Accounts {
    public CurrentAccount(int cust_id, String cust_name, double balance) {
        super(cust_id, cust_name, balance);
    }

    /**
     * Withdraws the indicated amount from the CurrentAccount requires : amt > 0 and
     * amt <= balance modifies : balance effects : amt is subtracted from balance,
     * resulting balance must be >= 0 returns : true
     * 
     * @param amt
     */
    public boolean withdraw(double amt) {
        balance -= amt;
        System.out.println("Withdrawn Amount = %.2f%nAvailable Balance = %.2f%n%n", amt, super.balance);
        return true;
    }

    public void deposit(double amt) {
        if (amt < 10000) {
            System.out.println("Depositing amount must be at least Rs 10,000.\n");
            return;
        }
        balance += amt;
        System.out.println("Amount Deposited%nCurrent Balance = %.2f%n%n", amt, super.balance);
    }

    public void display() {
        System.out.println("Customer ID = %d%nCustomer Name = %s%nBalance = %.2f%n%n", super.cust_id, super.cust_name,
                super.balance);
    }
}
