package application;

import java.util.Scanner;

import entities.*;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o titulo do post: ");
		String title = sc.nextLine();
		System.out.print("Insira o conteudo do post: ");
		String content = sc.nextLine();
		
		Post newPost1 = new Post(title,content);
		
		boolean makeAComment = true;
		
		do {
			System.out.println("Quer inserir um comentario? (y/n)");
			String op = sc.next();
			if(op.toUpperCase().equals("Y")) {
				System.out.println("Digite seu comentario: ");
				sc.nextLine();
				Comment comment = new Comment(sc.nextLine());
				newPost1.addComment(comment);
				newPost1.addLike();
			} else if(op.toUpperCase().equals("N")) {
				makeAComment = false;
			} else {
				System.out.println("Opcao invalida!");
			}
		} while (makeAComment);
		
	System.out.println("\n" + newPost1);
	
	sc.close();
	}
}
