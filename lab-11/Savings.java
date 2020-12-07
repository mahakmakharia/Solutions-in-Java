package banking.savings;

import banking.Accounts;

public class SavingsAccount extends Accounts {
    private double dwl;

    public SavingsAccount(int cust_id, String cust_name, double balance) {
        super(cust_id, cust_name, balance);
        dwl = 0.5 * this.balance;
    }

    public double getDwl() {
        return dwl;
    }

    public void withdraw(double amt) {
        if (amt < 0)
            System.out.println("Withdrawl Amount Cannot Be Negative\n");
        else if (amt > dwl)
            System.out.println("Amount Exceeds Daily Withdrawl Limit\n");
        else if (balance - amt < 1000)
            System.out.println("Not Sufficient Balance For Withdrawl\n");
        else {
            balance -= amt;
            System.out.printf("Withdrawn Amount = %.2f%nAvailable Balance = %.2f%n%n", amt, balance);
        }
    }

    public void deposit(double amt) {
        if (amt < 0)
            System.out.println("Invalid Deposit Amount");
        else {
            balance += amt;
            System.out.printf("Amount Deposited%nCurrent Balance = %.2f%n%n", amt, balance);
        }
    }

    public void display() {
        System.out.printf("Customer ID = %d%nCustomer Name = %s%nBalance = %.2f%n%n", cust_id, cust_name, balance);
    }
}
