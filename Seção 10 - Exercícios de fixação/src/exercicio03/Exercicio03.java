package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pessoa p[] = new Pessoa[n];
        
        for(int i = 0; i<n; i++) {
            System.out.println("Pessoa " + i);
            String nome = sc.next();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            p[i] = new Pessoa(nome,idade,altura);
        }
        
        double alturas = 0;
        
        for(int i = 0; i<n; i++) {
            alturas += p[i].getAltura();
        }
        
        System.out.println("Altura media: " + alturas/n);
        
        double fatia = 100/n;
        double porcentagem = 0;
        
        for(int i = 0; i<n; i++) {
            if(p[i].getIdade() < 16) {
                porcentagem += fatia;
                System.out.println(p[i].getNome());
            }
        }
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        
    }
}
