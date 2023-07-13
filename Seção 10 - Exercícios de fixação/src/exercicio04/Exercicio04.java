package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vet[] = new int[n];
        for(int i = 0; i<n; i++) {
            vet[i] = sc.nextInt();
        }
        
        int quant = 0;
        System.out.println("Numeros pares: ");
        for(int i = 0; i<n; i++) {
            if(vet[i] % 2 == 0) {
                System.out.println(vet[i] + " ");
                quant++;
            }
            
        }
        System.out.println("Quantidade de pares = " + quant);
    }
}
