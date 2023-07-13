package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vetor[] = new int[n];
        for(int i = 0;i<n;i++) {
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Números negativos: ");
        for(int i = 0; i<n; i++) {
            if (vetor[i] < 0)
                System.out.println(vetor[i]);
        }
    }
}
