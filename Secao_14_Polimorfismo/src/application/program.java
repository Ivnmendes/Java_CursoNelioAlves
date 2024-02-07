package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        Employee[] e = new Employee[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee #%d data: \n", i+1);
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (Character.toLowerCase(outsourced) == 'y') {
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                e[i] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else {
                e[i] = new Employee(name, hours, valuePerHour);
            }
        }

        System.out.println("PAYMENTS");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(e[i].getName() + " - $ " + e[i].payment());
        }
    }

}
