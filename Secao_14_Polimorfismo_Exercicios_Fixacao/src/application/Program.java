package application;

import entities.*;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");

        int numberProducts = sc.nextInt();

        Product[] p =  new Product[numberProducts];

        for(int i = 0; i < numberProducts; i++) {
            System.out.printf("Product #%d data:\n", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (Character.toLowerCase(type)) {
                case 'c':
                    p[i] = new Product(name, price);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String manufactureDate = sc.next();
                    p[i] = new UsedProduct(name, price, LocalDate.parse(manufactureDate, fmt1));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    p[i] = new ImportedProduct(name, price, customsFee);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }

        System.out.println("\nPRICE TAGS:");
        for(Product product : p) {
            System.out.println(product.priceTag());
        }
    }
}
