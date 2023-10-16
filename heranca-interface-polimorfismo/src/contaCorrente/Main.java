package contaCorrente;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		ContaCorrente c = null;
		ArrayList<ContaCorrente> listaContas = new ArrayList<ContaCorrente>();
		sc = new Scanner(System.in);
		int op, tipoConta, num;
		String nome;
		boolean aux = false;
		
		do {
			System.out.println("Escolha a Opção Desejada: "
					+ "\n"
					+ "\n1 - Criar Conta"
					+ "\n2 - Listar Clientes"
					+ "\n3 - Buscar Cliente"
					+ "\n0 - Sair");
			
			op = sc.nextInt();
						
			switch (op) {
			case 1:
				do {
					System.out.println("Escolha o Tipo de Conta: "
							+ "\n"
							+ "\n1 - Conta Padrão"
							+ "\n2 - Conta Especial"
							+ "\n0 - Retornar ao Menu Anterior");
					
					tipoConta = sc.nextInt();
					
					switch (tipoConta) {
					case 1:
						System.out.println("Informe o Nome do Titular: ");
						nome = sc.next();
						c = new ContaCorrente(nome);
						listaContas.add(c);
						break;

					case 2:
						System.out.println("Informe o Nome do Titular: ");
						nome = sc.next();
						c = new ContaEspecial(nome);
						listaContas.add(c);
						break;

					case 0:
						break;
					}
					
					break;
										
				} while (tipoConta != 0);
				
				break;				

			case 2:
				System.out.println(listaContas);
				break;

			case 3:
				System.out.println("Informe o Número da Conta");
				num = sc.nextInt();
				
				for (ContaCorrente conta : listaContas) {
					if (Objects.equals(num, conta.getNumero())) {
						System.out.println("Conta Encontrada!");
						System.out.println(conta);
						aux = true;
					}
				}
				
				if (!aux) {
					System.out.println("Conta Não Encontrada!");
				}
				
				aux = false;
				
				break;
				
			case 0:
				System.out.println("Volte Sempre!");
				break;
			
			}
			
		} while (op != 0);
		
		
	}

}
