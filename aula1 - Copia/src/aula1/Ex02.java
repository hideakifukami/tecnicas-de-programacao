package aula1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int contagem = 0;
		int soma = 0;
		int media;
		
		do {
			System.out.println("Escreva um n�mero inteiro maior ou igual a 0: ");
			num = sc.nextInt();
			contagem++;
			soma += num;
		} while (num >= 0);
		
		System.out.println("Quantidade de N�meros: " + contagem + ".");
		System.out.println("M�dia dos N�meros: " + soma/contagem + ".");
	}
}
