package application;

import entities.*;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();
        People[] p = new People[numberTaxPayers];

        for(int i = 0; i < numberTaxPayers; i++) {
            System.out.printf("Tax payer #%d data:", i+1);
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            switch (Character.toLowerCase(type)) {
                case 'c':
                    System.out.print("Number of eployees: ");
                    int numberEmployees = sc.nextInt();
                    p[i] = new CompanyPeople(name, anualIncome, numberEmployees);
                    break;
                case 'i':
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    p[i] = new IndividualPeople(name, anualIncome, healthExpenditures);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }

        double sumTaxes = 0;
        System.out.println("\nTAXES PAID:");
        for (People people : p) {
            System.out.printf("%s $ %.2f\n", people.getName(), people.taxes());
            sumTaxes += people.taxes();
        }
        System.out.println("TOTAL TAXES: $ " + sumTaxes);
    }
}
