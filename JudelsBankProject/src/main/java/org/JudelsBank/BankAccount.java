package org.JudelsBank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int id;
    private int accountNumber;
    private String name;
    private double balance;
    public double setBalance(double newestBalance) {
        this.balance = newestBalance;
        return newestBalance;
    }


    public BankAccount(int id, int accountNumber, String name, double balance) {
        this.id = (int) id;
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
