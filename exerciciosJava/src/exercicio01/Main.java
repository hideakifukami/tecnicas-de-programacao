package exercicio01;

import java.util.Scanner;

public class Main {

	static private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe o dia: ");
		int dia = sc.nextInt();
		System.out.println("Informe o mes: ");
		int mes = sc.nextInt();
		System.out.println("Informe o ano: ");
		int ano = sc.nextInt();
		
		Data data = new Data();
		data.inicilizaData(dia, mes, ano);
		data.mostraData();
	}
}
