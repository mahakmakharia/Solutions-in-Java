package banking;

import java.io.*;
import banking.savings.SavingsAccount;
import banking.current.CurrentAccount;

public class Bank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("SAVINGS ACCOUNT :");
        System.out.print("Customer ID : ");
        int custId = Integer.parseInt(br.readLine());
        System.out.print("Customer Name : ");
        String name = br.readLine();
        double balance;
        do {
            System.out.print("Opening Balance : ");
            balance = Double.parseDouble(br.readLine());
            if (balance < 1000)
                System.out.println("Minimum Balance must be Rs 1000");
        } while (balance < 1000);
        SavingsAccount savings = new SavingsAccount(custId, name, balance);
        double amt;
        System.out.print("Enter Withdrawl Amount : ");
        amt = Double.parseDouble(br.readLine());
        savings.withdraw(amt);
        savings.display();
        System.out.print("Enter Deposit Amount : ");
        amt = Double.parseDouble(br.readLine());
        savings.deposit(amt);
        savings.display();
        System.out.println("CURRENT ACCOUNT :");
        System.out.print("Customer ID : ");
        custId = Integer.parseInt(br.readLine());
        System.out.print("Customer Name : ");
        name = br.readLine();
        do {
            System.out.print("Opening Balance : ");
            balance = Double.parseDouble(br.readLine());
            if (balance < 0)
                System.out.println("Opening Balance Cannot Be Negative");
        } while (balance < 0);
        CurrentAccount current = new CurrentAccount(custId, name, balance);
        do {
            System.out.print("Enter Withdrawl Amount : ");
            amt = Double.parseDouble(br.readLine());
            if (amt < 0)
                System.out.println("Withdrawl Amount Cannot Be Negative");
            else if (amt > current.getBalance())
                System.out.println("Not Sufficient Balance For Withdrawl");
        } while (amt < 0 || amt > current.getBalance());
        current.withdraw(amt);
        current.display();
        System.out.print("Enter Deposit Amount : ");
        amt = Double.parseDouble(br.readLine());
        current.deposit(amt);
        current.display();
    }
}
