package aula1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String name = sc.next();
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Nome: " + name + ".");
		System.out.println("Idade: " + idade + ".");
		
		if (idade < 16) {
			System.out.println("N�o pode votar. ");
		}
		
		else if (idade == 16 || idade == 17 || idade > 65) {
			System.out.println("Voto facultativo. ");
		} else {
			System.out.println("Voto obrigat�rio. ");
		}
		
	}

}
