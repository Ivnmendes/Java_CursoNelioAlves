package exercicio;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pensionato p[] = new Pensionato[10];
        System.out.print("Insira quantos quartos serão alugados: ");
        int quartos = sc.nextInt();
        for(int i =0; i<quartos; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            
            p[quarto] = new Pensionato(nome,email,quarto);
        }
        
        for(int i = 0; i<10; i++) {
            if(p[i] != null)
                System.out.println(p[i]);
        }
    }
}
