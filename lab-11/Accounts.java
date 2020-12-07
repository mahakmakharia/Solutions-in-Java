package banking;

public abstract class Accounts {
    protected int cust_id;
    protected String cust_name;
    protected double balance;

    public Accounts(int cust_id, String cust_name, double balance) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void display();
}
