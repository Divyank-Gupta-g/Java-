//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

import java.util.*;

class BankAccount{
    String acc_no;
    double balance;

    public BankAccount(String acc_no, double balance){
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void deposite(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){ balance -= amount; }
        else{ System.out.println("Insufficient balance."); }
    }

    public double getbalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String acc_no, double balance){
        super(acc_no, balance);
    }

    public void withdraw(double amount){
        if(getbalance()-amount<100){ System.out.println("Maintain minimum balance."); }
        else{ super.withdraw(amount); }
    }
}

public class bank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create bank account with initial balance of $500: BA09876");
        BankAccount BA09876 = new BankAccount("BA09876", 500);

        System.out.print("Enter amount to deposite: ");
        double d = sc.nextDouble();
        BA09876.deposite(d);
        System.out.println("Updated balance: " + BA09876.getbalance());

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        BA09876.withdraw(w);
        System.out.println("Updated balance: " + BA09876.getbalance());

        System.out.println("Enter amount to withdraw: ");
        double w1 = sc.nextDouble();
        BA09876.withdraw(w1);
        System.out.println("Updated balance: " + BA09876.getbalance());

        System.out.println("Enter amount to withdraw: ");
        double w2 = sc.nextDouble();
        BA09876.withdraw(w2);
        System.out.println("Updated balance: " + BA09876.getbalance());
    }
}