package application;

import Util.CurrencyConverter;
import java.util.Scanner;

public class DolarCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da cotação do dolar");
        double dolarValue = sc.nextDouble();
        System.out.println("Insira o valor em dolares");
        double dolar = sc.nextDouble();
        System.out.println(CurrencyConverter.dolarConverter(dolar, dolarValue));
    }
}
