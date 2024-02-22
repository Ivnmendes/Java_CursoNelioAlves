package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount to withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("New Balance: " + acc.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
