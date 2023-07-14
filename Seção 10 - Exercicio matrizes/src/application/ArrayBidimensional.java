package application;

import java.util.Scanner;

public class ArrayBidimensional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("-----------\nInsira o valor de x: ");
		int x = sc.nextInt();
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.printf("Posicao: %d, %d:%n", i,j);
					if(j-1 >= 0) {
						System.out.printf("Esquerda: %d %n", matriz[i][j-1]);
					}
					if(j+1 <= n -1) {
						System.out.printf("Direita: %d %n", matriz[i][j+1]);
					}
					if(i-1 >= 0) {
						System.out.printf("Cima: %d %n", matriz[i-1][j]);
					}
					if(i+1 <= m - 1) {
						System.out.printf("Baixo: %d %n", matriz[i+1][j]);
					}
					System.out.println("------------------------");
				}
			}
		}
		sc.close();
	}
}
