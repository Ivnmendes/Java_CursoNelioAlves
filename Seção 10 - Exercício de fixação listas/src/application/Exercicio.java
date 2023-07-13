package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employees;

public class Exercicio {

	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp!= null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		System.out.print("Insira o numero de funcionários: ");
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.print("Insira o ID do funcionário: ");
			int id = sc.nextInt();
			while (hasId(list,id)) {
				System.out.println("ID já utilizado, tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Insira o nome do funcionário: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Insira o salário do funcionário: ");			
			double salario = sc.nextDouble();
			list.add(new Employees(id,nome,salario));
		}
		
		System.out.print("Insira o ID do funcionário que vai receber um aumento: ");
		int id = sc.nextInt();
		if(!(hasId(list,id))) {
			System.out.println("ID não existe!");
		} else {
			System.out.print("Insira a porcentagem do aumento: ");
			double increasePercentile = sc.nextDouble();
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					list.get(i).salaryIncrease(increasePercentile);
					break;
				}
			}
		}
		System.out.println("Lista de empregados \n------------------");
		for(Employees employee : list) {
			System.out.println(employee);
		}
	}

}
