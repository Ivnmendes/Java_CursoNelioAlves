package application;

import java.util.Scanner;
import util.Bank;

public class Application {
    public static void main(String[] args) {
        Bank user[] = new Bank[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("if you want to make a deposit type 1, if not, type 2: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Enter the deposit amount: ");
                double value = sc.nextDouble();
               user[0] = new Bank(name,value);
                System.out.println("Account created successfully");
                System.out.println(user[0]);
                break;
            case 2:
               user[0] = new Bank(name);
               System.out.println("Account created successfully");
               System.out.println(user[0]);
                break;
            default:
                System.out.println("Error - Invalid Value");
        }
        
        user[0].deposit(200);
        System.out.println(user[0]);
        user[0].withdraw(300);
        System.out.println(user[0]);
    }
}
