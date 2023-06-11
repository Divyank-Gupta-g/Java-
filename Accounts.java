//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.

import java.util.*;

abstract class BankAcc{
    String acc_no;
    double bal;

    public BankAcc(String acc_no, double bal){
        this.acc_no = acc_no;
        this.bal = bal;
    }

    public String getAcc_no(){ return acc_no; }
    public double getBalance(){ return bal; }

    void setBalance(double bal){
        this.bal = bal;
    }

    abstract void deposite(double amount);
    abstract void withdraw(double amount);
}

class SavingAcc extends BankAcc{
    public SavingAcc(String acc_no, double bal){
        super(acc_no, bal);
    }

    void deposite(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    void withdraw(double amount){
        if(getBalance()>=amount){
            setBalance(getBalance() - amount);
            System.out.println("Current Balance: " + getBalance());
        }
        else{
            System.out.println("Insufficient Balance.");
        }
    }
}

public class Accounts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SavingAcc sa = new SavingAcc("SA54321", 1000.0);
        
        System.out.print("Deposite: ");
        double dep = sc.nextDouble();
        sa.deposite(dep);

        System.out.print("Withdraw: ");
        double w = sc.nextDouble();
        sa.withdraw(w);
        
        System.out.print("Withdraw: ");
        double wd = sc.nextDouble();
        sa.withdraw(wd);
    }
}