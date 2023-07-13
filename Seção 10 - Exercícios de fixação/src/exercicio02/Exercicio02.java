package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vetor[] = new int[n];
        for(int i = 0; i<n;i++) {
            vetor[i] = sc.nextInt();
        }
        
        double soma = 0, media;
        System.out.print("Valores: ");
        for(int i = 0; i<n;i++) {
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }
        System.out.println("\nSoma: " + soma);
        media = soma/n;
        System.out.println("Media: " + media);
    }
}
