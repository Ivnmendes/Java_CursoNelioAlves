package util;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Bank {
    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    private String name;
    private String accountNumber;
    private double accountBalance;

    public Bank(String name, double accountBalance) {
        this.name = name;
        this.accountNumber =  generateAccountNumber();
        this.accountBalance = accountBalance;
    }

    public Bank(String name) {
        this.name = name;
        this.accountNumber =  generateAccountNumber();
        this.accountBalance = 0.;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void withdraw(double value) {
        this.accountBalance -= value + 5;
    }
    
    public void deposit (double value) {
        this.accountBalance += value;
    } 

    public String getAccountNumber() {
        return accountNumber;
    }
    
    private String generateAccountNumber() {
        Random generate = new Random();
        String number ="";
        for(int i =0; i<4;i++) {
            number += Integer.toString(generate.nextInt(10));
        }
        return "200" + number;
    }

    @Override
    public String toString() {
        return "bank{\n" + "name=" + name + ", "
                + "\naccountNumber=" + accountNumber + ", "
                + "\naccountBalance=" + us.format(accountBalance) + '}';
    }
    
}
